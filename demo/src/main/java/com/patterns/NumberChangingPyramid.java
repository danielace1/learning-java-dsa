package com.patterns;

public class NumberChangingPyramid {

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15

    public static void main(String[] args) {
        int n = 5;
        int i, j;
        int num = 1;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }

    }
}
