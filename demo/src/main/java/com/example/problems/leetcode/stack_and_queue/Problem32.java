package com.example.problems.leetcode.stack_and_queue;

import java.util.Stack;

// https://leetcode.com/problems/longest-valid-parentheses/
public class Problem32 {
    class Solution {
        public int longestValidParentheses(String s) {
            int n = s.length();

            Stack<Integer> stack = new Stack<>();
            stack.push(-1);

            int max = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(')
                    stack.push(i);
                else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        stack.push(i);
                    } else {
                        max = Math.max(max, i - stack.peek());
                    }

                }
            }

            return max;
        }
    }
}
