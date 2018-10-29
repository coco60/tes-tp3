package TP4;

import org.junit.Before;
import org.junit.Test;
import tests.tp3.Queue;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class QueueTestEtats {

    private Queue<Integer> queue;

    @Before
    public void setUp() {
        queue = new Queue<>();
    }

    @Test
    public void branche1() {
        try {
            queue.dequeue();
            fail();
        } catch (NoSuchElementException ignored) {}

        // Oracles
        assertEquals(0, queue.size());
        try {
            queue.peek();
            fail();
        } catch (NoSuchElementException ignored) {}
        assertNull(queue.getFirst());
        assertNull(queue.getLast());
    }

    @Test
    public void branche2() {
        queue.enqueue(1);

        // Oracles
        assertEquals(1, queue.size());
        assertEquals(1,(int) queue.peek());
        assertEquals(1,(int) queue.getLast());
    }

    @Test
    public void branche3() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();

        // Oracles
        assertEquals(2, queue.size());
        assertEquals(2,(int) queue.peek());
        assertEquals(3,(int) queue.getLast());
    }

    @Test
    public void branche4() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();

        // Oracles
        assertEquals(1, queue.size());
        assertEquals(2,(int) queue.peek());
        assertEquals(2,(int) queue.getLast());
    }

    @Test
    public void branche5() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Oracles
        assertEquals(3, queue.size());
        assertEquals(1,(int) queue.peek());
        assertEquals(3,(int) queue.getLast());
    }



}