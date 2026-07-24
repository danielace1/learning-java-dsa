package com.patterns;

public class RightTriangleRight {

//                    1
//                6   2
//           10   7   3
//       13  11   8   4
//   15  14  12   9   5
    public static void main(String[] args) {
        int n = 5;

        int start = 1;

        for (int i = 1; i <= n; i++) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print("    "); // 4 spaces
            }

            int val = start;
            int diff = n - i + 1;

            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d", val); // %4d - leave space and print
                val -= diff; // 13-2=11, 11-3=8, 8-4=4
                diff++; // 2,3,4
            }

            System.out.println();
 
            start += (n - i + 1); // row start val
        }

    }
}
