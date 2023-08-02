package edu.vandy.simulator.managers.palantiri.concurrentMapFairSemaphore

import admin.AssignmentTests
import admin.injectInto
import com.nhaarman.mockitokotlin2.*
import edu.vandy.simulator.managers.palantiri.Palantir
import edu.vandy.simulator.managers.palantiri.PalantiriManager
import edu.vandy.simulator.utils.Student
import edu.vandy.simulator.utils.Student.Type.Graduate
import edu.vandy.simulator.utils.Student.Type.Undergraduate
import io.mockk.Runs
import io.mockk.confirmVerified
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.spyk
import junit.framework.TestCase
import org.assertj.core.api.Assertions.assertThat
import org.junit.Assert.*
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap
import kotlin.test.assertFailsWith

/**
 * DO NOT try to convert to MockK because it does not support
 * spying on ConcurrentHashMap.
 */
class assignment3BConcurrentMapFairSemaphoreMgrTest : AssignmentTests(10) {
    companion object {
        private const val PALANTIRI_COUNT = 999
        private const val REPEAT_COUNT = 50
    }

    @Mock
    lateinit var mockPalantiriMap: MutableMap<Palantir, Boolean>

    @InjectMocks
    private val mockManager = mock<ConcurrentMapFairSemaphoreMgr>()

    @Test(timeout = 5000)
    fun `buildModel undergraduate test`() {
        runAs(Undergraduate)
        buildModelTestForAssignmentType(Undergraduate)
    }

    @Test(timeout = 5000)
    fun `buildModel graduate test`() {
        runAs(Graduate)
        buildModelTestForAssignmentType(Graduate)
    }

    private fun buildModelTestForAssignmentType(type: Student.Type) {
        val manager = ConcurrentMapFairSemaphoreMgr()
        manager.mPalantiri = buildPalantirList(manager)

        // Call SUT
        manager.buildModel()

        // Make sure it wasn't changed.
        assertEquals(PALANTIRI_COUNT, manager.mPalantiri.size)
        assertNotNull(manager.mPalantiriMap)
        assertEquals(manager.mPalantiri.size, manager.mPalantiriMap.size)
        assertNotNull(manager.mAvailablePalantiri)
        if (type == Undergraduate) {
            assertTrue(manager.mAvailablePalantiri is FairSemaphoreMO)
        } else {
            assertTrue(manager.mAvailablePalantiri is FairSemaphoreCO)
        }
        assertEquals(PALANTIRI_COUNT, manager.mAvailablePalantiri.availablePermits())
        assertThat(manager.mPalantiriMap).isExactlyInstanceOf(ConcurrentHashMap::class.java)
        manager.mPalantiri.forEach {
            assert(manager.mPalantiriMap[it] == true)
        }
    }

    //TODO: Does not work on CI/CD using Java 17 (timeout).
    @Test(timeout = 50000)
    fun `acquire multiple palantiri produces the expected result`() {
        val random = Random()
        repeat(REPEAT_COUNT) {
            mockManager.mPalantiri = buildPalantirList(mockManager)
            val map = buildPalantirMap(mockManager.mPalantiri)
            val spyMap = spy(map)
            mockManager.mPalantiriMap = spyMap
            mockManager.mAvailablePalantiri = mock()
            val inOrder = inOrder(mockManager.mAvailablePalantiri, spyMap)

            // Randomly pick a single palantir to be available.
            val availablePalantir = mockManager.mPalantiri[random.nextInt(PALANTIRI_COUNT)]
            for (palantir in mockManager.mPalantiriMap.keys) {
                mockManager.mPalantiriMap.replace(palantir, palantir === availablePalantir)
            }
            doCallRealMethod().whenever(mockManager).acquire()

            // Call SUT method.
            val result = mockManager.acquire()
            assertSame(availablePalantir, result)

            inOrder.verify(mockManager.mAvailablePalantiri).acquire()
            inOrder.verify(spyMap).keys
            inOrder.verify(spyMap).replace(availablePalantir, true, false)

            reset(mockManager)
        }
    }

    @Test(timeout = 5000)
    fun `acquire multiple palantiri implemented correctly`() {
        val mgr: ConcurrentMapFairSemaphoreMgr = spyk(ConcurrentMapFairSemaphoreMgr())
        val fs = mockk<FairSemaphore>()
        val p = mockk<Palantir>()
        val map = mutableMapOf(p to true)
        val smap = spyk(map)
        smap.injectInto(mgr)
        fs.injectInto(mgr)

        every { fs.acquire() } just Runs
        every { smap.replace(any(), any(), any()) } returns true
        assertThat(mgr.acquire()).isSameAs(p)
        io.mockk.verify(exactly = 1) {
            fs.acquire()
            smap.replace(any(), true, false)
            mgr.acquire()
            smap.keys
            p.hashCode()
        }
        confirmVerified(mgr, fs, smap, p)
    }

    @Test(timeout = 5000)
    fun `acquire throws cancellation exception`() {
        val mockSemaphore = mock<FairSemaphore>()
        doThrow(InterruptedException("mock exception")).whenever(mockSemaphore).acquire()
        mockSemaphore.injectInto(mockManager)
        verifyNoMoreInteractions(mockManager, mockSemaphore)
        doCallRealMethod().whenever(mockManager).acquire()

        // SUT
        assertFailsWith<InterruptedException> { mockManager.acquire() }
    }

    @Test(timeout = 5000)
    fun `release a previously acquired palantir`() {
        mockManager.mAvailablePalantiri = mock()
        val mockPalantir = mock<Palantir>()
        doCallRealMethod().whenever(mockManager).release(any())
        whenever(mockPalantiriMap.replace(mockPalantir, true)).thenReturn(false)

        // SUT
        mockManager.release(mockPalantir)

        verify(mockPalantiriMap).replace(mockPalantir, true)
        verify(mockManager.mAvailablePalantiri).release()
    }

    @Test(timeout = 5000)
    fun `release a palantir that has not yet been acquired`() {
        mockManager.mAvailablePalantiri = mock()
        val mockPalantir = mock<Palantir>()
        doCallRealMethod().whenever(mockManager).release(any())
        whenever(mockPalantiriMap.replace(mockPalantir, true)).thenReturn(true)

        // SUT
        assertFailsWith<IllegalArgumentException> {
            mockManager.release(mockPalantir)
        }

        verify(mockPalantiriMap).replace(mockPalantir, true)
        verify(mockManager.mAvailablePalantiri, never()).release()
    }

    @Test(timeout = 5000)
    fun `release a palantir that does not exist`() {
        mockManager.mAvailablePalantiri = mock()
        val mockPalantir = mock<Palantir>()
        doCallRealMethod().whenever(mockManager).release(any())
        whenever(mockPalantiriMap.replace(mockPalantir, true)).thenReturn(null)

        // SUT
        assertFailsWith<IllegalArgumentException> {
            mockManager.release(mockPalantir)
        }

        verify(mockPalantiriMap).replace(mockPalantir, true)
        verify(mockManager.mAvailablePalantiri, never()).release()
    }

    @Test(timeout = 5000)
    fun `release handles a null palantir`() {
        mockManager.mAvailablePalantiri = mock()
        doCallRealMethod().whenever(mockManager).release(any())

        // SUT
        try {
            mockManager.release(null)
        } catch (t: Throwable) {
            TestCase.fail("method should gracefully handle null input")
        }

        verify(mockPalantiriMap, never())[any()] = any()
        verify(mockManager.mAvailablePalantiri, never()).release()
    }

    private fun buildPalantirList(manager: PalantiriManager): List<Palantir> =
        List(PALANTIRI_COUNT) { Palantir(manager) }

    private fun buildPalantirMap(palantiri: List<Palantir>): ConcurrentMap<Palantir, Boolean> =
        ConcurrentHashMap<Palantir, Boolean>().also { map ->
            palantiri.forEach { map[it] = true }
        }
}