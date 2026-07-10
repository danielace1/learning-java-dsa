package com.example.problems;

import java.util.Arrays;

public class BSTInorder {
    public static void main(String[] args) {

        int[] arr = { 5, 2, 8, 1, 3 };

        Arrays.sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
