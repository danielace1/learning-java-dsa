package com.example.problems.leetcode.sliding_window;

import java.util.LinkedHashSet;
import java.util.Set;

// https://leetcode.com/problems/maximum-erasure-value/
public class Problem1695 {
    public static void main(String[] args) {
        class Solution {
            public int maximumUniqueSubarray(int[] nums) {
                Set<Integer> set = new LinkedHashSet<>();

                int left = 0;
                int sum = 0;
                int max = 0;

                for (int r = 0; r < nums.length; r++) {
                    while (set.contains(nums[r])) {
                        set.remove(nums[left]);
                        sum -= nums[left];
                        left++;
                    }

                    set.add(nums[r]);
                    sum += nums[r];

                    max = Math.max(max, sum);
                }
                return max;
            }
        }
    }
}
