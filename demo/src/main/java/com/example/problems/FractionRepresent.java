package com.example.problems;

public class FractionRepresent {

    public static void main(String[] args) {

        double n = 2.5;

        int whole = (int) n;

        double decimal = n - whole;

        if (decimal == 0) {
            System.out.println(whole);
            return;
        }

        int denominator = 1;

        while (decimal != Math.floor(decimal)) {
            decimal *= 10;
            denominator *= 10;
        }

        int numerator = (int) decimal;

        int a = numerator;
        int b = denominator;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;

        numerator /= gcd;
        denominator /= gcd;

        System.out.println(whole + " " + numerator + "/" + denominator);

    }
}
