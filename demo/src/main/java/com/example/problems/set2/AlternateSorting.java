package com.example.problems.set2;

import java.util.Arrays;

public class AlternateSorting {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // op: {7, 1, 6, 2, 5, 3, 4}

        int[] res = new int[arr.length];

        int l = 0;
        int r = arr.length - 1;
        int idx = 0;

        while (l <= r) {
            if (l != r) {
                res[idx++] = arr[r--];
            }
            res[idx++] = arr[l++];
        }

        System.out.println(Arrays.toString(res));

    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
