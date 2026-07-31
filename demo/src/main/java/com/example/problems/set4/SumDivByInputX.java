package com.example.problems.set4;

import java.util.ArrayList;
import java.util.List;

public class SumDivByInputX {
    public static void main(String[] args) {
        int[] arr = { 3, 9, 7, 4, 6, 8 };
        int x = 3;
        // X: 3
        // Output:
        // 3, 9
        // 3, 6
        // 9, 6
        // 3, 9, 6
        // No of groups: 4

        // int count = 0;

        // // group of size 2
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if ((arr[i] + arr[j]) % x == 0) {
        // System.out.println(arr[i] + ", " + arr[j]);
        // count++;
        // }
        // }
        // }

        // // group of size 3
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // for (int k = j + 1; k < arr.length; k++) {
        // if ((arr[i] + arr[j] + arr[k]) % x == 0) {
        // System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
        // count++;
        // }
        // }
        // }
        // }

        // System.out.println("No. of groups: " + count);

        anotherMethod(arr, x);

    }

    private static void anotherMethod(int[] arr, int x) {
        List<Integer> divisible = new ArrayList<>();

        for (int num : arr) {
            if (num % x == 0) {
                divisible.add(num);
            }
        }

        int count = 0;

        for (int i = 0; i < divisible.size(); i++) {
            for (int j = i + 1; j < divisible.size(); j++) {
                System.out.println(divisible.get(i) + ", " + divisible.get(j));
                count++;
            }
        }

        for (int i = 0; i < divisible.size(); i++) {
            for (int j = i + 1; j < divisible.size(); j++) {
                for (int k = j + 1; k < divisible.size(); k++) {
                    System.out.println(divisible.get(i) + ", " + divisible.get(j) + ", " + divisible.get(k));
                    count++;
                }
            }
        }

        System.out.println("No. of groups: " + count);
    }
}
