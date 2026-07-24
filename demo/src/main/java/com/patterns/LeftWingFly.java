package com.patterns;

public class LeftWingFly {

    // 1
    // 3 2
    // 6 5 4
    // 8 7
    // 9
    public static void main(String[] args) {
        int n = 3;

        int start = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((start - j) + " ");
            }
            System.out.println();

            start += i + 1;
        }

        start -= 2;

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((start - j) + " ");
            }
            System.out.println();

            start += i - 1;
        }

    }
}
