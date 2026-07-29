package com.example.problems.set3;

public class patternX {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "12345";

        X(s1);
        X(s2);

    }

    private static void X(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == j || j == s.length() - i - 1) {
                    System.out.print(s.charAt(j) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
