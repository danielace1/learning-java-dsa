package com.example.problems;

public class FactorOfArr {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5 };
        int n = 14;

        for (int x : arr) {
            while (n % x == 0) {
                n /= x;
            }
        }

        if (n == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
