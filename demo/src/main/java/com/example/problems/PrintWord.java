package com.example.problems;

public class PrintWord {
    public static void main(String[] args) {
        int num = 122; // 2618 // 06

        System.out.println(printWays(String.valueOf(num), ""));

    }

    private static int printWays(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return 1;
        }

        if (s.charAt(0) == '0') {
            return 0;
        }

        int count = 0;

        int one = s.charAt(0) - '0';

        // one digit
        if (one >= 1 && one <= 9) {
            count += printWays(s.substring(1), ans + convert(one));

        }

        // two digit
        if (s.length() >= 2) {
            int two = Integer.parseInt(s.substring(0, 2));
            if (two <= 26) {
                count += printWays(s.substring(2), ans + convert(two));

            }

        }

        return count;

    }

    private static char convert(int n) {
        return (char) ('A' + n - 1);
    }

}
