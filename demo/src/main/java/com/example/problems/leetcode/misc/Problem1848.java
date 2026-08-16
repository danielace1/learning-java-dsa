package com.example.problems.leetcode.misc;

// https://leetcode.com/problems/minimum-distance-to-the-target-element
public class Problem1848 {
    class Solution {
        public int getMinDistance(int[] arr, int target, int start) {
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    int distance = Math.abs(i - start);
                    min = Math.min(min, distance);
                }
            }

            return min;

        }
    }

}
