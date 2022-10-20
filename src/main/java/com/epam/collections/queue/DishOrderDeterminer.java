package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        List<Integer> list = new ArrayList<>();
        int sizeOfQueue = queue.size();
        int sizeOfNewQueue = sizeOfQueue;
        int indexOfSeq = 1;
        for (int i = 0; i < sizeOfQueue; i++) {
            PriorityQueue<Integer> queue1 = new PriorityQueue();
            for (int j = 1; j <= sizeOfNewQueue; j++) {
                if (indexOfSeq % everyDishNumberToEat == 0) {
                    list.add(queue.remove());
                    indexOfSeq = 1;
                } else {
                    queue1.add(queue.remove());
                    indexOfSeq++;
                }
            }
            sizeOfNewQueue = queue1.size();
            queue.addAll(queue1);
        }
        return list;
    }
}
