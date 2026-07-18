package com.example.problems.leetcode;

import java.util.Stack;

// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
public class Problem921 {
    class Solution {
        public int minAddToMakeValid(String s) {
            int count = 0;

            Stack<Character> stack = new Stack<>();

            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        count++;
                    } else {
                        stack.pop();
                    }
                }
            }

            return count + stack.size();
        }
    }
}
