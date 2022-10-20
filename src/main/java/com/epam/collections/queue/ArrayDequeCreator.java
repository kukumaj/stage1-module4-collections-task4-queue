package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(firstQueue.remove());
        arrayDeque.add(firstQueue.remove());
        arrayDeque.add(secondQueue.remove());
        arrayDeque.add(secondQueue.remove());
        while (firstQueue.size() != 0 && secondQueue.size() != 0) {
            firstQueue.add(arrayDeque.removeLast());
            arrayDeque.add(firstQueue.remove());
            arrayDeque.add(firstQueue.remove());
            secondQueue.add(arrayDeque.removeLast());
            arrayDeque.add(secondQueue.remove());
            arrayDeque.add(secondQueue.remove());
        }
        return arrayDeque;
    }
}
