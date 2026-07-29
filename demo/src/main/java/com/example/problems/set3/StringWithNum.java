package com.example.problems.set3;

public class StringWithNum {
    public static void main(String[] args) {
        String s = "a1b10"; // b3c6d15
        // abbbbbbbbb
        // bbbccccccddddddddddddddd

        String res = "";

        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i++);
            int num = 0;

            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
                i++;
            }

            for (int j = 0; j < num; j++) {
                res += ch;
            }
        }

        System.out.println(res);

    }
}
