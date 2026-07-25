package com.patterns;

public class Diamond {

//           * 
//         * * * 
//       * * * * * 
//     * * * * * * * 
//   * * * * * * * * * 
//     * * * * * * * 
//       * * * * * 
//         * * * 
//           * 
    public static void main(String[] args) {

        // star diamond
        starDiamond();


//    1 
//   3 2 
//  6 5 4 
// 10 9 8 7 
// 10 9 8 7 
//  6 5 4 
//   3 2 
//    1 

        // Number Diamond
        starNumber();


//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * * 
// * * * * * * * * * 
//   * * * * * * * 
//     * * * * * 
//       * * * 
//         * 

        // diamond
        diamond();

    }

    private static void starDiamond() {
        int n = 5;
        int i, j;
        // star pyramid
        // upper
        for (i = 1; i < n; i++) {
            for (j = i; j <= n; j++) {
                System.out.print("  ");
            }

            for (j = 1; j < i; j++) {
                System.out.print("* ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // lower
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (j = i; j < n; j++) {
                System.out.print("* ");
            }

            for (j = i; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    private static void starNumber() {

        int n = 4;
        int i, j;

        // upper half
        for (i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            int start = i * (i + 1) / 2;

            for (j = 0; j < i; j++) {
                System.out.print((start - j) + " ");
            }

            System.out.println();
        }

        // lower
        for (i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            int start = i * (i + 1) / 2; // row value

            for (j = 0; j < i; j++) {
                System.out.print((start - j) + " ");
            }
            System.out.println();

        }
    }

    private static void diamond() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
