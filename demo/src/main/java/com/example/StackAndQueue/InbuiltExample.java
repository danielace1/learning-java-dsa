package com.example.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InbuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(45);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(2);
        queue.add(4);

        System.out.println(queue.remove());
        System.out.println(queue.peek());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(20);
        deque.addLast(22);

        deque.removeFirst();

    }
}
