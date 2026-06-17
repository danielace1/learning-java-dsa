package com.example.recursion;

public class recursion1 {
    public static void main(String[] args) {
        // System.out.println(fact(5));
        // System.out.println(digitSum(1342));
        // System.out.println(digitProduct(550));
        // rev1(1234);
        // System.out.println(rev);

        // System.out.println(palindrome(4321234));

        System.out.println(countZero(30120));

    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
        // fun(--n); n-- vs --n
    }

    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.println(n);
    }

    static void funBoth(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);
    }

    static int fact(int n) {
        // not -ve
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
        // return n + fact(n - 1); sum of n numbers

    }

    static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitSum(n / 10);

    }

    static int digitProduct(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * digitProduct(n / 10);

    }

    // 1. reverse num way 1
    static int rev = 0;

    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        rev = rev * 10 + rem;
        rev1(n / 10);

    }

    // 2. reverse num way 2
    static int rev2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return revHelper(n, digits);
    }

    private static int revHelper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + revHelper(n / 10, digits - 1);
    }

    // palindrome
    static boolean palindrome(int n) {
        return n == rev2(n);
    }

    // count zeros
    static int countZero(int n) {
        return countHelper(n, 0);
    }

    private static int countHelper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return countHelper(n / 10, c + 1);
        }

        return countHelper(n / 10, c);

    }

}
