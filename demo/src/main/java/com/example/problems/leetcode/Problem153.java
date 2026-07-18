package com.example.problems.leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class Problem153 {
    class Solution {
        public int findMin(int[] nums) {
            Arrays.sort(nums);

            return nums[0];
        }
    }
}
