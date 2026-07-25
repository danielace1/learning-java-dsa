package com.patterns;

public class NumberTriangle {

    public static void main(String[] args) {

        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5

        System.out.println("Number Triangle: ");
        numberTriangle();

        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        System.out.println("Zero One Triangle");
        zeroOneTriangle();

// left half and right half triangle
//         1 
//       2 1 2 
//     3 2 1 2 3 
//   4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5 

        System.out.println("Palindrome Triangle");
        palindromeTriangle();

    }

    private static void numberTriangle() {
        int n = 5;

        int i, j;

        for (i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

    }

    private static void zeroOneTriangle() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }

            System.out.println();
        }
    }

    private static void palindromeTriangle() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " "); // left side 2
            }

            for (int j = 2; j <= i; j++) {
            System.out.print(j + " "); // right side 2
            }

            System.out.println();
        }
    }

}
