package com.example.patterns;

// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class Patterns {
    public static void main(String[] args) {

        pattern1(5);
        System.out.println("\n");
        pattern2(5);
        System.out.println("\n");
        pattern3(5);
        System.out.println("\n");
        pattern4(5);
        System.out.println("\n");
        pattern5(5);
        System.out.println("\n");
        pattern28(5);
        System.out.println("\n");
        pattern30(5);
        System.out.println("\n");
        pattern17(5);
        System.out.println("\n");
        pattern31(4);

    }

    // 1.
    // *****
    // *****
    // *****
    // *****
    // *****
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // 2.
    // *
    // **
    // ***
    // ****
    // *****
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // 3.
    // *****
    // ****
    // ***
    // **
    // *
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*  ");
            }

            System.out.println();
        }
    }

    // 4.
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    // 5.
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // 17.
    // 1
    // 212
    // 32123
    // 4321234
    // 32123
    // 212
    // 1
    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;

            for (int s = 0; s < n - c; s++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }

    }

    // 28.
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            int spaces = n - c;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // 30.
    // 1
    // 2 1 2
    // 3 2 1 2 3
    // 4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5
    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            for (int s = 0; s < n - row; s++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }

    }

    // 31.
    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {

            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

}
