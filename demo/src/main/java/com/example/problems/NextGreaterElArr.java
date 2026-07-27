package com.example.problems;

import java.util.Arrays;

public class NextGreaterElArr {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 10, 8, 2, 1, 15, 7 };
        // { 6, 3, 9, 10, 8, 2, 1, 15, 7 }

        int[] ans = new int[arr.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = -1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    ans[i] = arr[j];
                    break; // first next greater element if break
                    // if no break means big element in array from current element
                }
            }
        }

        System.out.println(Arrays.toString(ans));

    }
}
