package com.example.problems;

// https://leetcode.com/problems/decode-ways/
public class Problem91 {
    class Solution {
        static Integer dp[];

        public int numDecodings(String s) {
            dp = new Integer[s.length()];
            return printWays(s, 0);
        }

        private static int printWays(String s, int idx) {
            if (idx == s.length()) {
                return 1;
            }

            if (s.charAt(idx) == '0') {
                return 0;
            }

            if (dp[idx] != null) {
                return dp[idx];
            }

            int count = printWays(s, idx + 1);

            if (idx + 1 < s.length()) {
                int two = (s.charAt(idx) - '0') * 10 + (s.charAt(idx + 1) - '0');

                if (two >= 10 && two <= 26) {
                    count += printWays(s, idx + 2);
                }
            }

            return dp[idx] = count;
        }

    }
}
