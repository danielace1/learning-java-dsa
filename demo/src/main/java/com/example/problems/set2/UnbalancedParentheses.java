package com.example.problems.set2;

import java.util.Stack;

public class UnbalancedParentheses {
    public static void main(String[] args) {
        String s = "((abc)((de))"; // (((ab)
        // op: ((abc)(de))
        // (ab)

        Stack<Integer> stack = new Stack<>();

        boolean[] removed = new boolean[s.length()];

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    removed[i] = true;
                }
            }
        }

        while (!stack.isEmpty()) {
            removed[stack.pop()] = true;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!removed[i]) {
                ans.append(s.charAt(i));
            }
        }

        System.out.println(ans.toString());

    }
}
