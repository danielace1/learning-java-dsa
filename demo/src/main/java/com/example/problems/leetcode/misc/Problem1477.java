package com.example.problems.leetcode.misc;

import java.util.Arrays;

// https://leetcode.com/problems/find-two-non-overlapping-sub-arrays-each-with-target-sum
public class Problem1477 {
    class Solution {
        public int minSumOfLengths(int[] arr, int target) {
            int left = 0;
            int sum = 0;

            int[] best = new int[arr.length];
            Arrays.fill(best, Integer.MAX_VALUE);
            int ans = Integer.MAX_VALUE;

            for (int right = 0; right < arr.length; right++) {
                sum += arr[right];

                while (sum > target) {
                    sum -= arr[left];
                    left++;
                }

                if (right > 0) {
                    best[right] = best[right - 1];
                }

                if (sum == target) {
                    int currLen = right - left + 1;

                    if (left > 0 && best[left - 1] != Integer.MAX_VALUE) {
                        ans = Math.min(ans, currLen + best[left - 1]);
                    }

                    best[right] = Math.min(best[right], currLen);
                }

            }

            return ans == Integer.MAX_VALUE ? -1 : ans;
        }
    }
}
