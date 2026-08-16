package com.example.problems.leetcode.arrays_and_hashing;

public class Problem3936 {
    class Solution {
        public int minimumSwaps(int[] nums) {
            int f = 0;
            int l = nums.length - 1;

            int swaps = 0;

            while (f < l) {
                while (f < l && nums[f] != 0) {
                    f++;
                }

                while (f < l && nums[l] == 0) {
                    l--;
                }

                if (f < l) {
                    swap(nums, f, l);
                    swaps++;
                    f++;
                    l--;
                }
            }

            return swaps;

        }

        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
