package com.patterns;

public class Xpattern {

// H       H 
//   E   E   
//     L     
//   L   L   
// O       O 

    public static void main(String[] args) {
        String s = "HELLO";


        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == j || j == s.length() - i - 1) {
                    System.out.print(s.charAt(i) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
