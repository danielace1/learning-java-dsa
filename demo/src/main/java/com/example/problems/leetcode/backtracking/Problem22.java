package com.example.problems.leetcode.backtracking;


// https://leetcode.com/problems/generate-parentheses
public class Problem22 {
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> res = new ArrayList<>();

            backtrack(res, "", 0, 0, n);

            return res;
        }

        void backtrack(List<String> res, String str, int open, int close, int n) {
            if (open == n && close == n) {
                res.add(str);
                return;
            }

            if (open < n) {
                backtrack(res, str + "(", open + 1, close, n);
            }

            if (close < open) {
                backtrack(res, str + ")", open, close + 1, n);
            }
        }
    }
}