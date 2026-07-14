package com.example.problems;

import java.util.Stack;

public class Postfix {

    // reverse polish notation
    public static void main(String[] args) {
        String s = "481*+3-"; // 481*+3-
        // 8*1+4-3=9

        Stack<Integer> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }

            }
        }

        System.out.println(stack.pop());

    }
}
