package com.example.problems;

// https://leetcode.com/problems/longest-palindromic-substring/
public class Problem5 {
    class Solution {
        public String longestPalindrome(String s) {
            int start = 0;
            int end = 0;

            for (int i = 0; i < s.length(); i++) {
                int len1 = expand(s, i, i);
                int len2 = expand(s, i, i + 1);

                int len = Math.max(len1, len2);

                if (len > end - start + 1) {
                    start = i + (i - len) / 2;
                    end = i + len / 2;
                }

            }
            return s.substring(start, end + 1);
        }

        private static int expand(String s, int l, int r) {
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }

            return r - l - 1;
        }
    }
}
