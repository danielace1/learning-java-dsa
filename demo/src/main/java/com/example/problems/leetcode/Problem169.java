package com.example.problems.leetcode;

// https://leetcode.com/problems/majority-element
public class Problem169 {
    class Solution {
        public int majorityElement(int[] nums) {
            int count = 0;
            int candidate = 0;

            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }

                if (num == candidate) {
                    count++;
                } else {
                    count--;
                }
            }

            return candidate;

        }

    }
}
