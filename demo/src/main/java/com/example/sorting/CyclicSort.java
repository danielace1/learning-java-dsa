package com.example.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {

        // int i = 0;
        // while (i < arr.length) {
        // int correctIndex = arr[i] - 1;

        // if (arr[i] != arr[correctIndex]) {
        // swap(arr, i, correctIndex);
        // } else {
        // i++;
        // }
        // }

        for (int i = 0; i < arr.length; i++) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
                i--;
            }
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
