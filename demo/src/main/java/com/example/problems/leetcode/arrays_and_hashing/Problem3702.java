package com.example.problems.leetcode.arrays_and_hashing;

// https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor
public class Problem3702 {
    class Solution {
        public int longestSubsequence(int[] nums) {
            int xor = 0;
            boolean hasNonZero = false;

            for (int num : nums) {
                xor ^= num;
                if (num != 0) {
                    hasNonZero = true;
                }
            }

            if (xor != 0) {
                return nums.length;
            }

            if (hasNonZero) {
                return nums.length - 1;
            }

            return 0;

        }
    }
}
