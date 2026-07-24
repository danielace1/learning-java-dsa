package com.example.StackAndQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        // CustomQueue queue = new CustomQueue(5);
        CircularQueue queue = new CircularQueue();

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.display();

        System.out.println(queue.remove());

        queue.insert(50);

        queue.display();

    }
}
