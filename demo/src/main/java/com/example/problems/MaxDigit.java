package com.example.problems;

import java.util.Arrays;

public class MaxDigit {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 15, 8 };
        // [10,20,40,50,51,80] , max digit=2;

        // int[] arr = { 4, 3, 70, 15, 118 };

        int maxDig = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int count = (temp == 0) ? 1 : 0;

            while (temp > 0) {
                temp /= 10;
                count++;
            }
            maxDig = Math.max(maxDig, count);
        }

        for (int i = 0; i < arr.length; i++) {
            int rev = reverse(arr[i]);

            int digits = countDigits(arr[i]);

            while (digits < maxDig) {
                rev *= 10;
                digits++;
            }

            arr[i] = rev;

        }

        System.out.println(maxDig);
        System.out.println(Arrays.toString(arr));

    }

    private static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        return rev;
    }

    private static int countDigits(int n) {
        if (n == 0)
            return 1;

        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }

        return count;
    }
}
