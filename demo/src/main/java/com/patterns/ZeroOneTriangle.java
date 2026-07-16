package com.patterns;

public class ZeroOneTriangle {

    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1

    public static void main(String[] args) {

        int n = 5;
        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }

            System.out.println();
        }

    }
}
