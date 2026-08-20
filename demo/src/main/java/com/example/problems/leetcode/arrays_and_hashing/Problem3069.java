package com.example.problems.leetcode.arrays_and_hashing;

// https://leetcode.com/problems/distribute-elements-into-two-arrays-i
public class Problem3069 {
    class Solution {
        public int[] resultArray(int[] nums) {
            int[] arr1 = new int[nums.length];
            int[] arr2 = new int[nums.length];

            arr1[0] = nums[0];
            arr2[0] = nums[1];

            int p1 = 1;
            int p2 = 1;

            for (int i = 2; i < nums.length; i++) {
                if (arr1[p1 - 1] > arr2[p2 - 1]) {
                    arr1[p1] = nums[i];
                    p1++;
                } else {
                    arr2[p2] = nums[i];
                    p2++;
                }
            }

            int[] ans = new int[nums.length];
            int k = 0;

            for (int i = 0; i < p1; i++) {
                ans[k++] = arr1[i];
            }

            for (int i = 0; i < p2; i++) {
                ans[k++] = arr2[i];
            }

            return ans;
        }
    }
}
