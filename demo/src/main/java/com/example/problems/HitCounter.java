package com.example.problems;

import java.util.LinkedList;
import java.util.Queue;

public class HitCounter {
    private Queue<Integer> queue;

    public HitCounter() {
        queue = new LinkedList<>();
    }

    public void hit(int timeStamp) {
        queue.offer(timeStamp);
    }

    public int getHits(int timeStamp) {
        while (!queue.isEmpty() && timeStamp - queue.peek() >= 300) {
            queue.poll();
        }

        return queue.size();
    }

    public static void main(String[] args) {
        HitCounter hitCounter = new HitCounter();

        hitCounter.hit(1);
        hitCounter.hit(2);
        hitCounter.hit(3);

        System.out.println(hitCounter.getHits(4)); // 3

        hitCounter.hit(300);

        System.out.println(hitCounter.getHits(300)); // 4
        System.out.println(hitCounter.getHits(301)); // 3
    }

}
