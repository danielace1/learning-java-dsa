package com.example.problems.leetcode.sliding_window;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency
public class Problem2958 {
    class Solution {
        public int maxSubarrayLength(int[] nums, int k) {
            // int max=nums[0];

            // for(int num:nums){
            // max=Math.max(max,num);
            // }

            // int[] freq=new int[max+1];

            // int left=0;
            // int ans=0;

            // for(int right=0;right<nums.length;right++){
            // freq[nums[right]]++;

            // while(freq[nums[right]]>k){
            // freq[nums[left]]--;
            // left++;
            // }

            // ans=Math.max(ans,right-left+1);
            // }

            // return ans;

            Map<Integer, Integer> freq = new HashMap<>();

            int left = 0;
            int maxLen = 0;

            for (int right = 0; right < nums.length; right++) {
                freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

                while (freq.get(nums[right]) > k) {
                    freq.put(nums[left], freq.get(nums[left]) - 1);
                    left++;
                }
                maxLen = Math.max(maxLen, right - left + 1);
            }

            return maxLen;
        }
    }
}
