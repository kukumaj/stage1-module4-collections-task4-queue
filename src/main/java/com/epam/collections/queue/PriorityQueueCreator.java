package com.epam.collections.queue;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(firstList);
        priorityQueue.addAll(secondList);
        PriorityQueue<String> priorityQueueResult = new PriorityQueue<>(Collections.reverseOrder());
        int sizePriorityQueue = priorityQueue.size();
        for (int i = 0; i < sizePriorityQueue; i++) {
            priorityQueueResult.add(priorityQueue.remove());
        }
        return priorityQueueResult;
    }
}
