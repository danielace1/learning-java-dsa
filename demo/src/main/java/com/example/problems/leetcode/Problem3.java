package com.example.problems.leetcode;

import java.util.HashSet;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class Problem3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> set = new HashSet<>();

            int start = 0;
            int maxLen = 0;

            // i- end
            for (int i = 0; i < s.length(); i++) {
                while (set.contains(s.charAt(i))) {
                    set.remove(s.charAt(start));
                    start++;
                }

                set.add(s.charAt(i));

                maxLen = Math.max(maxLen, i - start + 1);
            }
            return maxLen;

        }
    }
}
