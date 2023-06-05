package edu.vandy.simulator.managers.palantiri.spinLockHashMap

import admin.AssignmentTests
import admin.injectInto
import admin.value
import edu.vandy.simulator.managers.palantiri.Palantir
import edu.vandy.simulator.utils.Assignment.isGraduate
import edu.vandy.simulator.utils.Assignment.isUndergraduate
import edu.vandy.simulator.utils.Student
import edu.vandy.simulator.utils.Student.Type.Graduate
import io.mockk.*
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.SpyK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import java.util.*
import java.util.concurrent.Semaphore
import java.util.function.Consumer
import java.util.function.Predicate
import java.util.function.Supplier
import java.util.stream.Stream
import kotlin.test.assertFailsWith

@ExperimentalCoroutinesApi
class Assignment1BSpinLockHashMapMgrTest : AssignmentTests(0) {
    @MockK
    internal lateinit var cancellableLockMock: CancellableLock

    @MockK
    lateinit var semaphoreMock: Semaphore

    private val manager = spyk<SpinLockHashMapMgr>()

    private val spinLock: CancellableLock
        get() = manager.value(CancellableLock::class.java)

    private val availablePalantiri: Semaphore
        get() = manager.value(Semaphore::class.java)

    // In order to put mock entries in this map, it can't be a mock.
    @SpyK
    private var palantiriMap = HashMap<Palantir, Boolean>(PALANTIRI_COUNT)

    // In order to put mock entries in this list, it can't be a mock.
    private var palantiri = mutableListOf<Palantir>()

    @Before
    fun before() {
        repeat(PALANTIRI_COUNT) {
            mockk<Palantir>().let {
                palantiri.add(it)
                palantiriMap[it] = true
            }
        }

        // mPalantiriMap and mPalantiri can't be mocked themselves,
        // only their contents can be mocked.
        palantiriMap.injectInto<Map<Palantir, Boolean>>(manager)
        palantiri.injectInto(manager)

        cancellableLockMock.injectInto(manager)
        semaphoreMock.injectInto(manager)
    }

    @Test
    fun buildModelUndergraduate() {
        runAs(Student.Type.Undergraduate)
        buildModel()
    }

    @Test
    fun buildModelGraduate() {
        runAs(Graduate)
        buildModel()
    }

    @Test
    fun `buildModel creates proper palantiri hashmap`() {
        // Note that the buildModel method does not use the
        // SpinLockHashMapMgr created in the @Before setup
        // method because it needs to test the real Semaphore,
        // SpinLock, and Map fields for proper initialization.
        val mockPalantiri = (1..PALANTIRI_COUNT).map { mockk<Palantir>() }

        every { manager.palantiri } returns mockPalantiri

        // Call SUT method.
        manager.buildModel()

        if (isUndergraduate()) {
            assertThat(spinLock).isInstanceOf(SpinLock::class.java)
        } else if (isGraduate()) {
            assertThat(spinLock).isInstanceOf(ReentrantSpinLock::class.java)
        }

        assertThat(manager.value<Map<Palantir, Boolean>>().size).isEqualTo(PALANTIRI_COUNT)
    }

    private fun buildModel() {
        val list = mockk<List<Palantir>>(relaxed = true)
        list.injectInto(manager)

        val palantiriMap = mockk<HashMap<Palantir, Boolean>>().also {
            it.injectInto<Map<Palantir, Boolean>>(manager)
        }

        every { manager.palantiri } returns list
        every { list.forEach(any<Consumer<Palantir>>()) } returns Unit
        every { list.size } returns PALANTIRI_COUNT

        // Call SUT method.
        manager.buildModel()

        verify {
            list.size
            manager.palantiri
        }

        if (isUndergraduate()) {
            try {
                verify { list.iterator() }
            } catch (t: Throwable) {
                verify { list.forEach(any<Consumer<Palantir>>()) }
            }

            assertThat(spinLock).isInstanceOf(SpinLock::class.java)
        } else if (isGraduate()) {
            verify { list.forEach(any<Consumer<Palantir>>()) }
            assertThat(spinLock).isInstanceOf(ReentrantSpinLock::class.java)
        }

        assertThat(availablePalantiri).isNotNull
        assertThat(availablePalantiri.queueLength).isEqualTo(0)
        assertThat(spinLock).isNotNull()
        assertThat(palantiriMap).isNotNull
    }

//    protected Palantir acquire1() throws InterruptedException {
//        mAvailablePalantiri.acquire();
//        mCancellableLock.lock(this::isCancelled);
//        try {
//            Palantir p = mPalantiriMap
//                    .entrySet()
//                .stream()
//                .filter(entry -> entry.setValue(false))
//            .map(Map.Entry::getKey)
//                .findFirst()
//                .orElse(null);
//            if (p != null)
//                return p;
//        } finally {
//            mCancellableLock.unlock();
//        }
//    }

    @Test
    fun `acquire is implemented correctly`() {
        val mgr = spyk<SpinLockHashMapMgr>()
        val ap = mockk<Semaphore>()
        val cl = mockk<CancellableLock>()
        val pm = mockk<MutableMap<Palantir, Boolean>>()
        val es = mockk<MutableSet<MutableMap.MutableEntry<Palantir, Boolean>>>()
        val ess = mockk<Stream<MutableMap.MutableEntry<Palantir, Boolean>>>()
        val ps = mockk<Stream<Palantir>>()
        val op = mockk<Optional<Palantir>>()
        val me = mockk<MutableMap.MutableEntry<Palantir, Boolean>>()
        val pl = mockk<MutableList<Palantir>>()
        val p = mockk<Palantir>()
        ap.injectInto(mgr)
        cl.injectInto(mgr)
        pm.injectInto(mgr)
        pl.injectInto(mgr)
        assertThat(mgr.palantiri).isSameAs(pl)

        every { ap.acquire() } answers { Unit }
        every { mgr.isCancelled } answers { true }
        every { cl.lock(any<Supplier<Boolean>>()) } answers {
            assertThat(firstArg<Supplier<Boolean>>().get()).isTrue
            Unit
        }
        every { pm.entries } answers { es }
        every { es.stream() } answers { ess }
//        every { me.setValue(any()) } returnsMany listOf(true, false)
        every { me.setValue(any()) } answers { true }
        every { ess.filter(any()) } answers {
            assertThat(firstArg<Predicate<Map.Entry<Palantir, Boolean>>>().test(me)).isTrue
//            assertThat(firstArg<Predicate<Map.Entry<Palantir, Boolean>>>().test(me)).isFalse
            ess
        }
        every { ess.map<Palantir>(any()) } answers { ps }
        every { ps.findFirst() } answers { op }
        every { op.orElse(null) } answers { p }
        every { cl.unlock() } answers { Unit }

        //SUT
        mgr.acquire()

        verify(exactly = 1) {
            ap.acquire()
            cl.lock(any())
            mgr.isCancelled
            es.stream()
            ess.filter(any())
            pm.entries
            ess.map<Palantir>(any())
            ps.findFirst()
            cl.unlock()
            op.orElse(any())
            mgr.palantiri
            me.setValue(any())
        }

        confirmVerified(mgr, ap, cl, pm, op, pl, p, ess, ps, me, es)
    }

    @Test
    fun `acquire a palantir when all palantiri are available`() {
        // SUT
        val palantir = manager.acquire()

        assertThat(palantir).isNotNull
        assertThat(palantiriMap.values.count { !it }).isEqualTo(1)

        verify {
            semaphoreMock.acquire()
            cancellableLockMock.lock(any())
            cancellableLockMock.unlock()
        }

        confirmVerified(cancellableLockMock, semaphoreMock)
    }

    /**
     * Uses mManager instance created in the @Before setup method.
     */
    @Test
    fun `acquire a palantir when only one palantir is available`() {
        lockAllPalantiri()
        val unlockedPalantir = palantiri[PALANTIRI_COUNT - 1]
        unlockPalantir(unlockedPalantir)

        // SUT
        val palantir = manager.acquire()

        assertThat(palantir).isNotNull
        val locked = palantiriMap.values.count { !it }
        assertThat(locked).isEqualTo(PALANTIRI_COUNT)
        assertThat(palantir).isSameAs(unlockedPalantir)

        verifyOrder {
            semaphoreMock.acquire()
            cancellableLockMock.lock(any())
            cancellableLockMock.unlock()
        }

        confirmVerified(cancellableLockMock, semaphoreMock)
    }

    /**
     * Uses mManager instance created in the @Before setup method.
     */
    @Test
    fun `acquire all available palantiri`() {
        for (i in 1..PALANTIRI_COUNT) {
            // SUT
            val palantir = manager.acquire()

            assertThat(palantir).isNotNull
            val locked = palantiriMap.values.count { !it }
            assertThat(locked).isEqualTo(i)
        }

        verify(exactly = PALANTIRI_COUNT) {
            semaphoreMock.acquire()
            cancellableLockMock.lock(any())
            cancellableLockMock.unlock()
        }

        verifyOrder {
            semaphoreMock.acquire()
            cancellableLockMock.lock(any())
            cancellableLockMock.unlock()
        }

        confirmVerified(cancellableLockMock, semaphoreMock)
    }

    @Test
    fun `acquire does not call unlock if semaphore acquire fails`() {
        every { semaphoreMock.acquire() } throws SimulatedException()

        // SUT
        assertFailsWith<SimulatedException> { manager.acquire() }

        verify { semaphoreMock.acquire() }

        confirmVerified(cancellableLockMock, semaphoreMock)
    }

    @Test
    fun `acquire does not call unlock if lock fails`() {
        every { cancellableLockMock.lock(any()) } throws SimulatedException()

        // SUT
        assertFailsWith<SimulatedException> { manager.acquire() }

        verify {
            semaphoreMock.acquire()
            cancellableLockMock.lock(any())
        }
        confirmVerified(cancellableLockMock, semaphoreMock)
    }

    @Test
    fun `acquire calls unlock when unexpected exception is thrown`() {
        every { palantiriMap.entries } throws SimulatedException()

        // SUT
        assertFailsWith<SimulatedException> { manager.acquire() }

        verify {
            semaphoreMock.acquire()
            cancellableLockMock.lock(any())
            cancellableLockMock.unlock()
        }
        confirmVerified(cancellableLockMock, semaphoreMock)
    }

    @Test
    fun `release a null palantir`() {
        assertFailsWith<IllegalArgumentException> { manager.release(null) }

        confirmVerified(cancellableLockMock, semaphoreMock)
    }

    @Test
    fun `release a locked palantir`() {
        val palantiriMap = mockk<HashMap<Palantir, Boolean>>().also {
            it.injectInto<Map<Palantir, Boolean>>(manager)
        }
        val palantir = mockk<Palantir>()

        every { palantiriMap.replace(palantir, true) } returns false

        // SUT
        manager.release(palantir)

        verifyOrder {
            cancellableLockMock.lock(any())
            palantiriMap.replace(palantir, true)
            cancellableLockMock.unlock()
            semaphoreMock.release()
        }

        confirmVerified(palantiriMap, palantir, cancellableLockMock, semaphoreMock)
    }

    @Test
    fun `release an unlocked palantir`() {
        val palantiriMap = mockk<HashMap<Palantir, Boolean>>().also {
            it.injectInto<Map<Palantir, Boolean>>(manager)
        }
        val palantir = mockk<Palantir>()

        every { palantiriMap.replace(palantir, true) } returns true

        // SUT
        assertFailsWith<IllegalArgumentException> { manager.release(palantir) }

        verifyOrder {
            cancellableLockMock.lock(any())
            palantiriMap.replace(palantir, true)
            cancellableLockMock.unlock()
        }

        verify(exactly = 0) { semaphoreMock.release() }

        confirmVerified(palantiriMap, palantir, cancellableLockMock, semaphoreMock)
    }

    @Test
    fun `release all acquired palantiri`() {
        lockAllPalantiri()

        // SUT
        palantiri.forEach { manager.release(it) }

        verify(exactly = PALANTIRI_COUNT) {
            semaphoreMock.release()
            cancellableLockMock.unlock()
            cancellableLockMock.lock(any())
        }
        assertThat(palantiriMap.values.count { it }).isEqualTo(PALANTIRI_COUNT)
        confirmVerified(cancellableLockMock, semaphoreMock)
    }

    @Test
    fun `release must call cancellable lock and semaphore methods in the correct order`() {
        lockAllPalantiri()
        manager.release(palantiri[0])

        verifySequence {
            cancellableLockMock.lock(any())
            cancellableLockMock.unlock()
            semaphoreMock.release()
        }
    }

    @Test
    fun `release does not unlock the lock if the lock call is interrupted`() {
        every { cancellableLockMock.lock(any()) } throws SimulatedException()

        val palantir = Palantir(manager)

        // SUT
        assertFailsWith<SimulatedException> { manager.release(palantir) }

        verify { cancellableLockMock.lock(any()) }
        confirmVerified(cancellableLockMock, semaphoreMock)
    }

    @Test
    fun `release never throws a NullPointerException`() {
        val palantir = Palantir(manager)

        // SUT
        assertFailsWith<IllegalArgumentException> { manager.release(palantir) }
    }

    private fun lockAllPalantiri() {
        // Lock all but the last Palantir in the Map.
        for (i in 0 until PALANTIRI_COUNT) {
            val palantir = palantiri[i]
            palantiriMap[palantir] = false
        }
    }

    private fun unlockPalantir(palantir: Palantir) {
        palantiriMap[palantir] = true
    }

    private fun lockPalantir(palantir: Palantir) {
        palantiriMap[palantir] = false
    }

    companion object {
        private const val PALANTIRI_COUNT = 5
    }
}