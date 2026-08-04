package com.example.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-missing-elements
public class Problem3731 {
    class Solution {
        public List<Integer> findMissingElements(int[] nums) {

            int min = nums[0];
            int max = nums[0];

            boolean[] present = new boolean[101];

            for (int num : nums) {
                min = Math.min(min, num);
                max = Math.max(max, num);
                present[num] = true;
            }

            List<Integer> ans = new ArrayList<>();
            for (int num = min; num <= max; num++) {
                if (!present[num]) {
                    ans.add(num);
                }
            }
            return ans;
        }

    }
}
