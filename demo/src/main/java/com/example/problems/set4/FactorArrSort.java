package com.example.problems.set4;

import java.util.Arrays;

public class FactorArrSort {
    public static void main(String[] args) {
        int[] arr = { 8, 2, 3, 12, 16 };
        // 12, 16, 8, 2, 3

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (factors(arr[j]) < factors(arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    private static int factors(int n) {

        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }

        return count;
    }
}
