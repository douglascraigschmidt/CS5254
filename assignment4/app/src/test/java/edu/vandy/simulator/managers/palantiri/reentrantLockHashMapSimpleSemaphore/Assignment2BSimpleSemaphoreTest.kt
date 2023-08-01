package edu.vandy.simulator.managers.palantiri.reentrantLockHashMapSimpleSemaphore

import admin.*
import io.mockk.*
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.SpyK
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertThrows
import org.junit.Before
import org.junit.Test
import java.util.concurrent.locks.Condition
import java.util.concurrent.locks.Lock
import kotlin.random.Random
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import kotlin.test.fail

class Assignment2BSimpleSemaphoreTest : AssignmentTests(0) {
    private val palantirCount = Random.nextInt(5, 20)

    @MockK
    lateinit var lock: Lock

    @MockK
    lateinit var notZero: Condition

    @SpyK
    var semaphore = SimpleSemaphore()

    @Before
    fun before() {
        lock.injectInto(semaphore)
        notZero.injectInto(semaphore)
    }

    private fun getPermits(): Int = semaphore.getField("", Int::class.java)

    private fun setPermits(permits: Int) {
        permits.injectInto(semaphore)
    }

    @Test
    fun `Permits is declared correctly`() {
        with(SimpleSemaphore::class.java.findField(Int::class.java)) {
            assertTrue(hasModifiers("volatile"))
        }
    }

    @Test
    fun `acquire one permit`() {
        setPermits(palantirCount)

        semaphore.acquire()

        verifySequence {
            lock.lockInterruptibly()
            lock.unlock()
        }

        val expectedAvailablePermits = palantirCount - 1
        assertEquals(
            "Available permits should be $expectedAvailablePermits",
            expectedAvailablePermits,
            semaphore.availablePermits()
        )
    }

    @Test
    fun `acquire one permit when none are immediately available`() {
        val expectedAwaitCalls = Random.nextInt(3, 5)
        setPermits(-(expectedAwaitCalls - 1))
        every { notZero.await() } answers {
            if (getPermits() <= 0) {
                setPermits(getPermits() + 1)
            }
        }

        semaphore.acquire()

        verifyOrder {
            lock.lockInterruptibly()
            notZero.await()
            lock.unlock()
        }
        verify(exactly = expectedAwaitCalls) { notZero.await() }

        val expectedAvailablePermits = 0
        assertEquals(
            "Available permits should be $expectedAvailablePermits",
            expectedAvailablePermits,
            semaphore.availablePermits()
        )
    }

    @Test
    fun `acquire all permits`() {
        setPermits(palantirCount)

        for (i in 0 until palantirCount) {
            semaphore.acquire()
        }

        verify(exactly = palantirCount) {
            lock.lockInterruptibly()
            lock.unlock()
        }
        verifyOrder {
            lock.lockInterruptibly()
            lock.unlock()
        }

        val expectedAvailablePermits = 0
        assertEquals(
            "Available permits should be $expectedAvailablePermits",
            expectedAvailablePermits,
            semaphore.availablePermits()
        )
    }

    @Test
    fun `acquire multiple permits with await calls`() {
        (-palantirCount).injectInto(semaphore)

        every { notZero.await() } answers {
            val permits = semaphore.getField<Int>("", Int::class.java)
            (permits + 1).injectInto(semaphore)
        }

        semaphore.acquire()

        verifyOrder {
            semaphore.acquire()
            lock.lockInterruptibly()
            notZero.await()
            lock.unlock()
        }
        verify(exactly = palantirCount + 1) { notZero.await() }
        confirmVerified(semaphore, lock, notZero)

        val expectedAvailablePermits = 0
        assertEquals(
            "Available permits should be $expectedAvailablePermits",
            expectedAvailablePermits,
            semaphore.availablePermits()
        )
    }

    @Test
    fun `acquire one permit with an await call`() {
        0.injectInto(semaphore)

        every { notZero.await() } answers {
            1.injectInto(semaphore)
        }

        semaphore.acquire()

        verifySequence {
            semaphore.acquire()
            lock.lockInterruptibly()
            notZero.await()
            lock.unlock()
        }

        confirmVerified(lock, notZero, semaphore)

        val expectedAvailablePermits = 0
        assertEquals(
            "Available permits should be $expectedAvailablePermits",
            expectedAvailablePermits,
            semaphore.availablePermits()
        )
    }

    @Test
    fun `acquire permit with await call interrupted`() {
        0.injectInto(semaphore)

        every { notZero.await() } throws InterruptedException("Mock interrupt")

        assertFailsWith<InterruptedException> { semaphore.acquire() }

        verifySequence {
            semaphore.acquire()
            lock.lockInterruptibly()
            notZero.await()
            lock.unlock()
        }
        val expectedAvailablePermits = 0
        assertEquals(
            "Available permits should be $expectedAvailablePermits",
            expectedAvailablePermits,
            semaphore.availablePermits()
        )
    }

    @Test
    fun `acquire permit uninterruptibly with permits available`() {
        every { semaphore.acquire() } answers { }
        semaphore.acquireUninterruptibly()

        assertFalse(Thread.currentThread().isInterrupted)

        verify(exactly = 1) { semaphore.acquireUninterruptibly() }
        verifySequence {
            semaphore.acquireUninterruptibly()
            semaphore.acquire()
        }
        confirmVerified(lock, notZero, semaphore)
    }

    @Test
    fun `acquire uninterruptibly should not directly modify permits`() {
        every { semaphore.acquire() } answers { }

        val permits = Random.nextInt(10, 20)
        permits.injectInto(semaphore)
        assertEquals(permits, semaphore.primitiveValue<Int>(Int::class))

        semaphore.acquireUninterruptibly()

        val result = semaphore.primitiveValue<Int>(Int::class)
        assertEquals(permits, result)

        verify(exactly = 1) { semaphore.acquireUninterruptibly() }
        verifySequence {
            semaphore.acquireUninterruptibly()
            semaphore.acquire()
        }
        confirmVerified(lock, notZero, semaphore)
    }

    @Test
    fun `acquire permit uninterruptibly should not be interruptible`() {
        // andThen {} is required for this test to work.
        every { semaphore.acquire() } throws InterruptedException("Mock exception") andThenAnswer {}

        semaphore.acquireUninterruptibly()

        verify(exactly = 1) { semaphore.acquireUninterruptibly() }
        verifySequence {
            semaphore.acquireUninterruptibly()
            semaphore.acquire()
            semaphore.acquire()
        }
        confirmVerified(lock, notZero, semaphore)
    }

    @Test
    fun `acquire uninterruptibly should reset interrupt flag when interrupted`() {
        val mock = mockk<SimpleSemaphore>()

        val interrupts = 3 + Random.nextInt(7)
        var loopCount = 0

        every { mock.acquireUninterruptibly() } answers { callOriginal() }

        every { mock.acquire() } answers {
            val wasInterrupted = Thread.interrupted()
            assertFalse(
                wasInterrupted,
                "Thread should have reset the Thread interrupted flag."
            )
            loopCount++
            if (loopCount <= interrupts) {
                throw InterruptedException("Mock interrupt.")
            }
        }

        try {
            mock.acquireUninterruptibly()
        } catch (e: Exception) {
            fail("Exception $e should not have been thrown.")
        }

        verify(exactly = 1) { mock.acquireUninterruptibly() }
        verify(exactly = interrupts + 1) { mock.acquire() }
        confirmVerified(lock, notZero, mock)

        val wasInterrupted = Thread.interrupted()
        assertTrue(wasInterrupted, "Thread should have reset the Thread interrupted flag.")
    }

    @Test
    fun `acquire permit uninterruptibly should set interrupt flag before returning`() {
        // andThen {} is required for this test to work.
        every { semaphore.acquire() } throws InterruptedException("Mock exception") andThenAnswer {
            Thread.interrupted()
        }

        semaphore.acquireUninterruptibly()

        verify(exactly = 1) { semaphore.acquireUninterruptibly() }
        verifySequence {
            semaphore.acquireUninterruptibly()
            semaphore.acquire()
            semaphore.acquire()
        }
        confirmVerified(lock, notZero, semaphore)

        assertTrue(Thread.currentThread().isInterrupted)
    }

    @Test
    fun `acquire permit uninterruptibly should set interrupt flag if interrupted`() {
        // andThen {} is required for this test to work.
        every { semaphore.acquire() } throws InterruptedException("Mock exception") andThenAnswer { }
        assertFalse(Thread.currentThread().isInterrupted)
        semaphore.acquireUninterruptibly()
        assertTrue(Thread.currentThread().isInterrupted)

        verify(exactly = 1) { semaphore.acquireUninterruptibly() }
        verify { semaphore.acquireUninterruptibly() }
        verify(exactly = 2) { semaphore.acquire() }

        confirmVerified(lock, notZero, semaphore)
    }

    @Test
    fun `release permit with signal`() {
        setPermits(0)

        semaphore.release()

        verify {
            lock.lockInterruptibly()
            notZero.signal()
            lock.unlock()
        }

        val expectedAvailablePermits = 1
        assertEquals(
            "Available permits should be $expectedAvailablePermits",
            expectedAvailablePermits,
            semaphore.availablePermits()
        )
    }

    @Test
    fun `release permit with no signal`() {
        setPermits(-1)

        semaphore.release()

        verifySequence {
            semaphore.release()
            lock.lockInterruptibly()
            lock.unlock()
        }

        val expectedAvailablePermits = 0
        assertEquals(
            "Available permits should be $expectedAvailablePermits",
            expectedAvailablePermits,
            semaphore.value(Int::class.java)
        )

        confirmVerified(lock, notZero, semaphore)
    }

    @Test
    fun `release permit with only when positive`() {
        setPermits(1)

        semaphore.release()

        verifySequence {
            lock.lockInterruptibly()
            notZero.signal()
            lock.unlock()
        }

        assertEquals(getPermits(), 2)
    }
}