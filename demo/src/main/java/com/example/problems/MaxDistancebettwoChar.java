package com.example.problems;

public class MaxDistancebettwoChar {
    public static void main(String[] args) {
        String s = "vwwxcvcxw";

        int maxDistance = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    maxDistance = Math.max(maxDistance, j - i - 1);
                }
            }
        }

        System.out.println(maxDistance);

    }
}
