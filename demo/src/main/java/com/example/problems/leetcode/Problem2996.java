package com.example.problems.leetcode;

// https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum
public class Problem2996 {
    class Solution {
        public int missingInteger(int[] nums) {
            int sum = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1] + 1) {
                    sum += nums[i];
                } else {
                    break;
                }
            }

            int x = sum;

            while (true) {
                boolean found = false;

                for (int num : nums) {
                    if (num == x) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    return x;
                }
                x++;
            }
        }
    }
}
