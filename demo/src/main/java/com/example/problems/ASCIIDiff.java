package com.example.problems;

import java.util.Arrays;

public class ASCIIDiff {
    public static void main(String[] args) {
        String str = "acxz";

        int n = str.length();

        boolean beautiful = true;

        for (int i = 0; i < n - 1; i++) {
            int diff1 = Math.abs(str.charAt(i) - str.charAt(i + 1));

            int diff2 = Math.abs(str.charAt(n - i - 1) - str.charAt(n - i - 2));

            if (diff1 != diff2) {
                beautiful = false;
                break;
            }

        }

        System.out.println(beautiful);
    }
}
