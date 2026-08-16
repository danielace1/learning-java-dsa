package com.example.problems.leetcode.arrays_and_hashing;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/intersection-of-multiple-arrays/
public class Problem2248 {
    class Solution {
        public List<Integer> intersection(int[][] nums) {
            int[] freq = new int[1001];

            for (int[] num : nums) {
                for (int i : num) {
                    freq[i]++;
                }
            }

            List<Integer> ans = new ArrayList<>();

            for (int i = 0; i <= 1000; i++) {
                if (freq[i] == nums.length) {
                    ans.add(i);
                }
            }

            return ans;
        }
    }
}
