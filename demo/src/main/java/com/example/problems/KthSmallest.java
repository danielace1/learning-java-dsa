package com.example.problems;

import java.util.PriorityQueue;

// kth smallest without modifying the array
public class KthSmallest {
    public static void main(String[] args) {

        // int[] arr = { 4, 7, 1, 2, 10, 0, 3 };
        // int k = 3;

        int[] arr1 = { 2, 3, 6, 7, 9 }; // asc
        int[] arr2 = { 1, 4, 8, 10 }; // asc

        int k = 3;

        // findSmallest(arr1, arr2);
        // System.out.println(findKthSmallest(arr, k));
        System.out.println(findKthSmallestWithoutFunc(arr1, k));
    }

    private static int findKthSmallestWithoutFunc(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }

            if (count == k - 1) {
                return arr[i];
            }
        }

        return -1;
    }

    private static void findSmallest(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int count = 0;

        int k = 2;

        while (i < arr1.length && j < arr2.length) {
            int val;

            if (arr1[i] < arr2[j]) {
                val = arr1[i];
                i++;
            } else {
                val = arr2[j];
                j++;
            }

            count++;

            if (count == k) {
                System.out.println(val);
                return;
                // return val;
            }
        }

        while (i < arr1.length) {
            count++;
            if (count == k) {
                System.out.println(arr1[i]);
                return;
            }
            i++;
        }

        while (j < arr2.length) {
            count++;
            if (count == k) {
                System.out.println(arr2[j]);
                return;
            }
            j++;
        }

        System.out.println(-1);
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
