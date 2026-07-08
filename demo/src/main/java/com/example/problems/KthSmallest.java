package com.example.problems;

import java.util.PriorityQueue;

// kth smallest without modifying the array
public class KthSmallest {
    public static void main(String[] args) {

        int[] arr = { 4, 7, 1, 2, 10, 0, 3 };
        int k = 3;

        System.out.println(findKthSmallest(arr, k));
    }

    private static int findKthSmallest(int[] arr, int k) {

        if (arr.length - 1 < k)
            return -1;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);
        }

        for (int i = 0; i < k - 1; i++) {
            minHeap.poll(); // remove first element;
        }

        return minHeap.peek();

    }

}
