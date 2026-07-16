package com.example.problems;

import java.util.Arrays;

public class CanSeeArray {

    // normal approach
    public static void main(String[] args) {
        int[] arr = { 10, 8, 9, 11, 5 };
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            int canc = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.min(arr[i], arr[j]) > max) {
                    canc++;
                }
                max = Math.max(max, arr[j]);
            }
            res[i] = canc;
        }

        System.out.println(Arrays.toString(res));
    }
}
