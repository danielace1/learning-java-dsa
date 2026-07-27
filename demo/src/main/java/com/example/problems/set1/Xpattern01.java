package com.example.problems.set1;

public class Xpattern01 {
    public static void main(String[] args) {
        String s = "PROGRAM";

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
