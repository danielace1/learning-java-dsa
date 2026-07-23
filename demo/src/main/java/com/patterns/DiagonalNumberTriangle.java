package com.patterns;

public class DiagonalNumberTriangle {

    // 11
    // 7 12
    // 4 8 13
    // 2 5 9 14
    // 1 3 6 10 15

    public static void main(String[] args) {
        int n = 6;

        int i, gap;

        for (i = 0; i < n; i++) {
            int num = 1 + (n - i - 1) * (n - i) / 2;

            System.out.print(num);

            for (gap = n - i + 1; gap <= n; gap++) {
                num += gap;
                System.out.print(" " + num);
            }

            System.out.println();
        }

    }
}
