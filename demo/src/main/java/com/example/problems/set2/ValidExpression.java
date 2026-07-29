package com.example.problems.set2;

import java.util.Stack;

public class ValidExpression {
    public static void main(String[] args) {
        String s = "(a+b)(a*b)";
        // valid
        // (ab)(ab+) - invalid

        Stack<Character> stack = new Stack<>();

        boolean expectOperand = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
                expectOperand = true;
            } else if (isOperand(ch)) {
                if (!expectOperand) {
                    System.out.println("Invalid");
                    return;
                }
                expectOperand = false;
            } else if (isOperator(ch)) {
                if (expectOperand) {
                    System.out.println("Invalid");
                    return;
                }
                expectOperand = true;
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    System.out.println("invalid");
                    return;
                }

                if (expectOperand) {
                    System.out.println("invalid");
                    return;
                }

                stack.pop();
                expectOperand = false;
            }
        }

        if (!stack.isEmpty() || expectOperand) {
            System.out.println("invalid");
        } else {
            System.out.println("valid");
        }

    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static boolean isOperand(char ch) {
        return ch == 'a' || ch == 'b';
    }
}
