package com.patterns;

public class RightSidedTriangle {

//             * 
//           * * 
//         * * * 
//       * * * * 
//     * * * * *  
//   * * * * * * 
    public static void main(String[] args) {

        int n = 6;

        int i, j;

        for (i = 1; i <= n; i++) {

            for (j = i; j <= n; j++) {
                System.out.print("  ");  // two space
            }

            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
