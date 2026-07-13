package com.example.problems;

public class RotateStrings {

    public static void main(String[] args) {
        String s = "ZOHOCORPORATION";
        char r = 'L';
        int n = 4;

        System.out.println(rotations(s, r, n));

    }

    private static String rotations(String s, char r, int n) {
        int len = s.length();
        n = n % len;

        if (r == 'L') {
            return s.substring(n) + s.substring(0, n);
        } else if (r == 'R') {

            return s.substring(len - n) + s.substring(0, len - n);
        }
        return s;

    }
}