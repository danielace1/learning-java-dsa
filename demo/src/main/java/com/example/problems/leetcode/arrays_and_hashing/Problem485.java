package com.example.problems.leetcode.arrays_and_hashing;

// https://leetcode.com/problems/max-consecutive-ones/
public class Problem485 {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            int count = 0;

            for (int num : nums) {
                if (num == 1) {
                    count++;
                    max = Math.max(max, count);
                } else {
                    count = 0;
                }
            }

            return max;
        }
    }
}
