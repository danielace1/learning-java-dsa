package com.patterns;

public class Xpattern {

// H       H 
//   E   E   
//     L     
//   L   L   
// O       O 

    public static void main(String[] args) {
        String s = "HELLO";

        char[] ch = s.toCharArray();
        int n = ch.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - i - 1) {
                    System.out.print(ch[i] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
