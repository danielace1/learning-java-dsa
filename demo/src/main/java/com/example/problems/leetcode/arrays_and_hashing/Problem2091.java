package com.example.problems.leetcode.arrays_and_hashing;

// https://leetcode.com/problems/removing-minimum-and-maximum-from-array
public class Problem2091 {
    class Solution {
        public int minimumDeletions(int[] nums) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            int minIndex = -1;
            int maxIndex = -1;

            for (int i = 0; i < nums.length; i++) {
                if (min > nums[i]) {
                    min = nums[i];
                    minIndex = i;
                }
                if (max < nums[i]) {
                    max = nums[i];
                    maxIndex = i;
                }
            }

            if (minIndex > maxIndex) {
                int temp = minIndex;
                minIndex = maxIndex;
                maxIndex = temp;
            }

            int n = nums.length;

            int front = maxIndex + 1;

            int back = n - minIndex;

            int both = (minIndex + 1) + (n - maxIndex);

            return Math.min(front, Math.min(back, both));

        }
    }
}
