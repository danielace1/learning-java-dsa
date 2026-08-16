package com.example.problems.leetcode.two_pointers;

// https://leetcode.com/problems/container-with-most-water/
public class Problem11 {
    class Solution {
        public int maxArea(int[] height) {
            int n = height.length;

            int left = 0;
            int right = n - 1;
            int ans = 0;

            while (left < right) {
                int width = right - left;

                int h = Math.min(height[left], height[right]);

                int area = h * width;

                ans = Math.max(ans, area);

                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }

            return ans;

        }
    }
}
