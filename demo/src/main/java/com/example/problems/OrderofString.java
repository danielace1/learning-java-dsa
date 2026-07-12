package com.example.problems;

import java.util.Arrays;

public class OrderofString {
    public static void main(String[] args) {
        String s = "String"; // 4

        System.out.println(findOrder(s.toLowerCase()));

    }

    private static int fact(int n) {
        int fact = 1;
        while (n > 1) {
            fact *= n--;
        }

        return fact;
    }

    private static int findOrder(String s) {
        int order = 1;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int smaller = 0;

            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) < s.charAt(i)) {
                    smaller++;
                }
            }

            order += smaller * fact(n - i - 1);

        }

        return order;

    }

}
