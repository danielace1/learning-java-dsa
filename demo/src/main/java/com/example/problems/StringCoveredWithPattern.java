package com.example.problems;

public class StringCoveredWithPattern {

    // * * * *
    // * abc *
    // * def *
    // * ghi *
    // * * * *
    public static void main(String[] args) {
        String[] str = { "abc", "def", "ghi" };

        int n = 4;

        // int max = 0;
        // for (String s : str) {
        // max = Math.max(max, s.length());
        // }

        // for (int i = 0; i < n; i++) {
        // System.out.print("*");
        // }

        // System.out.println();

        // for (String s : str) {
        // System.out.println("*" + s + "*");
        // }

        // for (int i = 0; i < n; i++) {
        // System.out.print("*");
        // }

        int borderRows = n - str.length;
        int width = str[0].length() + 2;

        for (int i = 0; i < borderRows; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (String s : str) {
            System.out.println("*" + s + "*");
        }

        for (int i = 0; i < borderRows; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
