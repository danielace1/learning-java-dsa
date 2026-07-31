package com.example.problems.set4;

public class XBoxPattern {
    public static void main(String[] args) {

        pattern1(3, 3);
        System.out.println();
        pattern1(5, 4);
        System.out.println();
        pattern2(6, 7);
    }

    private static void pattern1(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    private static void pattern2(int n, int m) {
        int rowStart = 2;
        int rowEnd = m - 3;

        int colStart = 2;
        int colEnd = n - 3;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    System.out.print("X ");
                } else if (i >= rowStart && i <= rowEnd && j >= colStart && j <= colEnd) {
                    System.out.print("X ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

}
