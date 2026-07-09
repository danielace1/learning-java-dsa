package com.example.problems;

public class SmallestPosittiveMissingNum {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 1, 0, 2, 4, -1, -22, -4 };

        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int smallest = 0;

        for (int num : arr) {
            if (smallest == num) {
                smallest++;
            }
        }

        System.out.println(smallest);

    }
}