package com.example;

public class TimeComplexity {
    public static void main(String[] args) {
        // for (int i = 0; i < 11; i++) {
        // System.out.println(fibo2(i));
        // }

        System.out.println(fibo2(50));
    }

    static long fibo2(int n) {

        // Time complexity for fibo of n is :
        // Akra Bazzi formula
        return (long) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));

    }

    static int fibo(int n) {
        if (n < 2)
            return n;

        return fibo(n - 1) + fibo(n - 2);
    }
}
