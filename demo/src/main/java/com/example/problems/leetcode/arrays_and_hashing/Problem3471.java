package com.example.problems.leetcode.arrays_and_hashing;

import java.util.HashMap;
import java.util.HashSet;

public class Problem3471 {
    class Solution {
        public int largestInteger(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i <= nums.length - k; i++) {
                HashSet<Integer> set = new HashSet<>();

                for (int j = i; j < i + k; j++) {
                    set.add(nums[j]);
                }

                for (int num : set) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
            }
            int ans = -1;

            for (int num : map.keySet()) {
                if (map.get(num) == 1) {
                    ans = Math.max(ans, num);
                }
            }
            return ans;

            // int ans = -1;

            // for (int j = 0; j < nums.length; j++) {

            // int count = 0;

            // // Check every subarray of size k
            // for (int i = 0; i <= nums.length - k; i++) {

            // // Check whether nums[j] is present in this subarray
            // boolean found = false;

            // for (int x = i; x < i + k; x++) {
            // if (nums[x] == nums[j]) {
            // found = true;
            // break;
            // }
            // }

            // if (found) {
            // count++;
            // }
            // }

            // if (count == 1) {
            // ans = Math.max(ans, nums[j]);
            // }
            // }

            // return ans;
        }
    }
}
