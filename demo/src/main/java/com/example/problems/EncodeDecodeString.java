package com.example.problems;

import java.util.Stack;

public class EncodeDecodeString {
    public static void main(String[] args) {
        String s = "3[a2[c]]"; // 3[a]2[bc]
        // op: aaabcbc

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(num);
                stringStack.push(current);
                num = 0;
                current = new StringBuilder();
            } else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder prev = stringStack.pop();

                for (int i = 0; i < repeat; i++) {
                    prev.append(current);
                }

                current = prev;
            } else {
                current.append(ch);
            }
        }

        System.out.println(current);

    }

}
