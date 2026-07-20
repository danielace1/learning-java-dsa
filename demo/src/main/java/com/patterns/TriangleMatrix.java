package com.patterns;

public class TriangleMatrix {
    // Column-wise triangular number pattern,
    // 1
    // 2 6
    // 3 7 10
    // 4 8 11 13
    // 5 9 12 14 15

    public static void main(String[] args) {
        int n = 5;

        int[][] arr = new int[n][n];

        int num = 1;

        // for (int col = 0; col < n; col++) {
        // for (int row = col; row < n; row++) {
        // arr[row][col] = num++;
        // }
        // }

        for (int i = 1; i <= n; i++) {
            int counter = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter = counter + (n - j);
                // 2+(5-1)=2+4=6
            }
            System.out.println();
        }
        // for (int row = 0; row < n; row++) {
        // for (int col = 0; col <= row; col++) {
        // System.out.print(arr[row][col] + " ");
        // }

        // System.out.println();
        // }

    }
}
