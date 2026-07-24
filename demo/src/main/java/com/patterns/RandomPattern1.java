package com.patterns;

public class RandomPattern1 {
    public static void main(String[] args) {

        // 1
        // 2 4
        // 4 6 8
        // 7 9 11 13

        int n = 4;

        int i, j;
        int start = 1;

        for (i = 1; i <= n; i++) {
            int num = start;

            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 2;
            }

            System.out.println();
            start += i;
        }

    }
}
