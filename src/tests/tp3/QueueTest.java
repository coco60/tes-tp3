package tests.tp3;

import org.junit.Test;

import static org.junit.Assert.*;

class QueueTest {

    Queue<Integer> queue;

    @Test
    void TR1SEQ1() {
        queue = new Queue<Integer>();
        assertNull(queue.peek());
        queue.enqueue(1);
        assertEquals(1, (int) queue.peek());
        queue.dequeue();
        assertTrue(queue.isEmpty());
        queue.toString();
        queue.iterator();
    }

}