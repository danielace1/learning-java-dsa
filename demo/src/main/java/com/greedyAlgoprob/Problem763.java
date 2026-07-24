package com.greedyAlgoprob;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/partition-labels/
public class Problem763 {
    class Solution {
        public List<Integer> partitionLabels(String s) {
            int[] last = new int[26];

            for (int i = 0; i < s.length(); i++) {
                last[s.charAt(i) - 'a'] = i;
            }

            List<Integer> ans = new ArrayList<>();

            int start = 0;
            int end = 0;

            for (int i = 0; i < s.length(); i++) {
                end = Math.max(end, last[s.charAt(i) - 'a']);

                if (i == end) {
                    ans.add(end - start + 1);
                    start = i + 1;
                }
            }

            return ans;
        }
    }
}
