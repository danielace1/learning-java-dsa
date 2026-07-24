package com.patterns;

public class Diamond {
// full pyramid
//           *                        
//         * * * 
//       * * * * * 
//     * * * * * * * 
//   * * * * * * * * * 
//     * * * * * * * 
//       * * * * * 
//         * * * 
//           * 

// number diamond
//    1  
//   3 2
//  6 5 4
// 10 9 8 7
// 10 9 8 7 
//  6 5 4 
//   3 2 
//    1

    public static void main(String[] args) {
        int n = 4;

        int i, j;

        // star diamond
        // upper
        for (i = 1; i < n; i++) {
            for (j = i; j <= n; j++) {
                System.out.print("   ");
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

        // Number Diamond

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
}
