package com.patterns;

public class NumberIncreasingReversePyramid {

    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public static void main(String[] args) {
        int n = 5;

        int i, j;

        for (i = n; i >= 0; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        // for (i = 1; i <= n; i++) {
        // for (j = i; j <= n; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

    }
}
