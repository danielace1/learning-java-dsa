package com.example.problems;

public class StringCoveredWithPattern {
    public static void main(String[] args) {
        String[] str = { "abc", "def", "ghi" };

        int n = 4;

        int max = 0;
        for (String s : str) {
            max = Math.max(max, s.length());
        }

        for (int i = 0; i < max + 2; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (String s : str) {
            System.out.println("*" + s + "*");
        }

        for (int i = 0; i < max + 2; i++) {
            System.out.print("*");
        }
    }
}
