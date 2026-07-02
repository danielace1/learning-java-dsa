package com.example.problems;

// https://leetcode.com/problems/target-sum/description/
public class Problem494 {
    class Solution {
        public int findTargetSumWays(int[] nums, int target) {
            return helper(nums, 0, 0, target);
        }

        private int helper(int[] nums, int index, int sum, int target) {
            if (index == nums.length) {
                return sum == target ? 1 : 0;
            }

            int add = helper(nums, index + 1, sum + nums[index], target);
            int sub = helper(nums, index + 1, sum - nums[index], target);

            return add + sub;

        }
    }
}
