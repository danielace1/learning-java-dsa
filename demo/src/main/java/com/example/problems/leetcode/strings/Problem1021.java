package com.example.problems.leetcode.strings;

// https://leetcode.com/problems/remove-outermost-parentheses
public class Problem1021 {
    class Solution {
        public String removeOuterParentheses(String s) {
            String res = "";
            int depth = 0;

            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    if (depth > 0) {
                        res += ch;
                    }
                    depth++;
                } else {
                    depth--;
                    if (depth > 0) {
                        res += ch;
                    }
                }
            }

            return res;
        }
    }
}