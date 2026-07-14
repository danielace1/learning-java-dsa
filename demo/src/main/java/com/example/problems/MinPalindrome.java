package com.example.problems;

public class MinPalindrome {
    public static void main(String[] args) {
        String s = "2133";// 2222

        int n = Integer.parseInt(s);

        int res = 0;
        for (int i = n + 1; i <= 10000; i++) {
            if (isPalindrome(i)) {
                res = i;
                break;
            }
        }

        System.out.println(res);
    }

    private static boolean isPalindrome(int i) {
        int n = i;
        int rev = 0;
        while (i != 0) {
            int rem = i % 10;
            rev = rev * 10 + rem;
            i /= 10;
        }

        return rev == n;
    }
}
