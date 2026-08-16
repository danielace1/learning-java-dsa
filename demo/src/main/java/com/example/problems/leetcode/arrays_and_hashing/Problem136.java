package com.example.problems.leetcode.arrays_and_hashing;

// https://leetcode.com/problems/single-number/
public class Problem136 {
    class Solution {
        public int singleNumber(int[] nums) {
            int res = 0;

            for (int num : nums) {
                res ^= num;
            }

            return res;
        }
    }
}
