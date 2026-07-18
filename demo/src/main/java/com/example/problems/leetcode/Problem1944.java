package com.example.problems.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Problem1944 {
    public static void main(String[] args) {

        int[] arr = { 10, 6, 8, 5, 11, 9 };

        System.out.println(Arrays.toString(canSeePersonCount(arr)));

    }

    private static int[] canSeePersonCount(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] > stack.peek()) {
                stack.pop();
                ans[i]++;
            }

            if (!stack.isEmpty()) {
                ans[i]++;
            }
            stack.push(arr[i]);
        }

        return ans;
    }
}
