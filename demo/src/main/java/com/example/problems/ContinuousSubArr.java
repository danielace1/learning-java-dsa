package com.example.problems;

import java.util.Arrays;

public class ContinuousSubArr {
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 3, 8, 9, 1, 0, 5, 8, 3 };
        int[] arr2 = { 3, 8, 5 };

        Arrays.sort(arr2);

        for (int i = 0; i <= arr1.length - arr2.length; i++) {
            int[] window = new int[arr2.length];

            for (int j = 0; j < arr2.length; j++) {
                window[j] = arr1[i + j];
            }

            Arrays.sort(window);

            if (Arrays.equals(window, arr2)) {
                // System.out.println("index " + i + " to " + (i + arr2.length - 1));
            }

        }

    }
}
