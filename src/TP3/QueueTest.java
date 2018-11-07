package TP3;

import TP4.Queue;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class QueueTest {

    private Queue<Integer> queue;

    @Test
    public void Tranche1Sequence1() {

        // CR
        queue = new Queue<Integer>();
        assertNull(queue.getFirst());

        // TR
        queue.enqueue(1);
        assertEquals(1, (int)queue.getFirst());

        // TR
        assertEquals(1, (int) queue.dequeue());
        assertNull(queue.getFirst());

        // O
        assertTrue(queue.isEmpty());
        System.out.println(queue.toString());
        assertEquals("", queue.toString().trim());
        assertNotNull(queue.iterator());

    }

    @Test
    public void Tranche1Sequence2() {

        // CR
        queue = new Queue<Integer>();
        assertNull(queue.getFirst());

        // TR
        try {
            queue.dequeue();
            fail();
        } catch (NoSuchElementException ignored) {}
        assertNull(queue.getFirst());

        // TR
        queue.enqueue(1);
        assertEquals(1, (int)queue.getFirst());

        // O
        assertFalse(queue.isEmpty());
        assertEquals("1", queue.toString().trim());
        assertNotNull(queue.iterator());
        assertEquals(1, (int)queue.peek());

    }

    @Test
    public void Tranche2Sequence1() {

        // CR
        queue = new Queue<>();
        assertNull(queue.getLast());

        // TR
        queue.enqueue(1);
        assertEquals(1, (int) queue.getLast());

        // TR
        assertEquals(1, (int) queue.dequeue());
        assertNull(queue.getLast());

        // O

    }

    @Test
    public void Tranche2Sequence2() {

        // CR
        queue = new Queue<>();
        assertNull(queue.getLast());

        // TR
        try {
            queue.dequeue();
            fail();
        } catch (NoSuchElementException ignored) {}
        assertNull(queue.getLast());

        // TR
        queue.enqueue(1);
        assertEquals(1, (int) queue.getLast());

        // O

    }

    @Test
    public void Tranche3Sequence1() {

        // CR
        queue = new Queue<>();
        assertEquals(0, queue.size());

        // TR
        queue.enqueue(1);
        assertEquals(1, queue.size());

        // TR
        assertEquals(1, (int) queue.dequeue());
        assertEquals(0, queue.size());

        // O

    }

    @Test
    public void Tranche3Sequence2() {

        // CR
        queue = new Queue<>();
        assertEquals(0, queue.size());

        // TR
        try {
            queue.dequeue();
            fail();
        } catch (NoSuchElementException ignored) {}
        assertEquals(0, queue.size());

        // TR
        queue.enqueue(1);
        assertEquals(1, queue.size());

        // O

    }

    // White-box test methods to ensure maximum coverage >:D
    @Test
    public void coverageEnqueue() {
        queue = new Queue<>();
        assertEquals(0, queue.size());
        queue.enqueue(1);
        assertEquals(1, queue.size());
        queue.enqueue(2);
        assertEquals(2, queue.size());
    }

    @Test
    public void coverageListIterator() {
        try {
            queue = new Queue<>();
            queue.iterator().remove();
            fail();
        } catch (UnsupportedOperationException ignored) {}
    }
}