package com.example.problems;

public class ClosestFibonacci {
    public static void main(String[] args) {
        // int n = 5;
        int[] arr = { 10, 3, 3 };

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        if (sum <= 0) {
            System.out.println(0);
            return;
        }

        int a = 0;
        int b = 1;

        while (b < sum) {
            int c = a + b;
            a = b;
            b = c;
        }

        if (Math.abs(a - sum) <= Math.abs(b - sum)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}
