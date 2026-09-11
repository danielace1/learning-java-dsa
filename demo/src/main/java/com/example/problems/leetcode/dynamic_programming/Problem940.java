package com.example.problems.leetcode.dynamic_programming;

// https://leetcode.com/problems/distinct-subsequences-ii
public class Problem940 {
    class Solution {
        public int distinctSubseqII(String s) {
            final long MOD = 1_000_000_007;
            long dp = 1;

            long[] last = new long[26];

            for (char ch : s.toCharArray()) {
                int index = ch - 'a';

                long newDp = (2 * dp - last[index] + MOD) % MOD;

                last[index] = dp;

                dp = newDp;
            }

            return (int) ((dp - 1 + MOD) % MOD);

        }
    }
}
