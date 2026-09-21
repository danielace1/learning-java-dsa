package com.example.problems.leetcode.dynamic_programming;

// https://leetcode.com/problems/find-x-value-of-array-i
public class Problem3524 {
    class Solution {
        public long[] resultArray(int[] nums, int k) {
            long[] res = new long[k];
            int[] dp = new int[k];

            for (int num : nums) {
                int[] next = new int[k];
                int mod = num % k;

                next[mod]++;

                for (int r = 0; r < k; r++) {
                    if (dp[r] > 0) {
                        int newRem = (r * mod) % k;
                        next[newRem] += dp[r];
                    }
                }

                for (int r = 0; r < k; r++) {
                    res[r] += next[r];
                }

                dp = next;
            }

            return res;
        }
    }
}
