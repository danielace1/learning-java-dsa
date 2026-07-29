package com.example.problems.set2;

public class NumberSystem {
    public static void main(String[] args) {
        int n1 = 3, n2 = 4;

        for (int i = 0; i < 4000; i++) {
            if (numContains3And4(i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean numContains3And4(int n) {

        if (n == 0)
            return false;

        while (n > 0) {
            int rem = n % 10;
            if (rem != 3 && rem != 4) {
                return false;
            }
            n /= 10;
        }

        return true;

    }
}
