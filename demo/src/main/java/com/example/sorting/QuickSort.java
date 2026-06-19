package com.example.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 6, 2, 3, 1, 0, 5 };
        // quicksort(arr, 0, arr.length - 1);
        // System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

    }

    static void quicksort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now pivot is at correct index, sort two halves now
        quicksort(nums, low, e);
        quicksort(nums, s, high);
    }

}
