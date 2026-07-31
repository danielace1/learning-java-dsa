package com.example.problems.leetcode;

import java.util.Stack;

// https://leetcode.com/problems/daily-temperatures/
public class Problem739 {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int n = temperatures.length;
            int[] ans = new int[n];

            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < n; i++) {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int prev = stack.pop();
                    ans[prev] = i - prev;

                }

                stack.push(i);
            }

            return ans;
        }
    }
}
