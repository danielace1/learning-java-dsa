package com.example.problems.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/shortest-and-lexicographically-smallest-beautiful-string
public class Problem2904 {
    class Solution {
        public String shortestBeautifulSubstring(String s, int k) {
            List<Integer> ones = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    ones.add(i);
                }
            }

            if (ones.size() < k) {
                return "";
            }

            int minLen = Integer.MAX_VALUE;
            String ans = "";

            for (int i = 0; i + k - 1 < ones.size(); i++) {
                int left = ones.get(i);
                int right = ones.get(i + k - 1);

                int length = right - left + 1;

                String candidate = s.substring(left, right + 1);

                if (length < minLen) {
                    minLen = length;
                    ans = candidate;
                } else if (length == minLen && candidate.compareTo(ans) < 0) {
                    ans = candidate;
                }
            }

            return ans;
        }
    }
}
