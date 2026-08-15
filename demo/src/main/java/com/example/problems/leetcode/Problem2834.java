package com.example.problems.leetcode;

// https://leetcode.com/problems/find-the-minimum-possible-sum-of-a-beautiful-array/
public class Problem2834 {
    class Solution {
        public int minimumPossibleSum(int n, int target) {
            long sum = 0;

            int first = Math.min(n, target / 2);

            sum += (long) first * (first + 1) / 2;

            int rem = n - first;

            sum += (long) rem * (2L * target + rem - 1) / 2;

            return (int) (sum % 1_000_000_007);

        }
    }
}
