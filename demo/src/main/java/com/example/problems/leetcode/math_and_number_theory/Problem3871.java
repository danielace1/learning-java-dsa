package com.example.problems.leetcode.math_and_number_theory;

// https://leetcode.com/problems/count-commas-in-range-ii
public class Problem3871 {
    class Solution {
        public long countCommas(long n) {
            if (n < 1000) {
                return 0;
            }

            long comma = 0;

            if (n >= 1_000) {
                comma += (n - 1_000 + 1);
            }

            if (n >= 1_000_000) {
                comma += (n - 1_000_000 + 1);
            }

            if (n >= 1_000_000_000) {
                comma += (n - 1_000_000_000 + 1);
            }

            if (n >= 1_000_000_000_000L) {
                comma += (n - 1_000_000_000_000L + 1);
            }

            if (n >= 1_000_000_000_000_000L) {
                comma += (n - 1_000_000_000_000_000L + 1);
            }

            return comma;
        }
    }

}
