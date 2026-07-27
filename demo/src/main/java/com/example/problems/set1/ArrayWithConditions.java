package com.example.problems.set1;

import java.util.Arrays;

public class ArrayWithConditions {

    static int weight(int n) {
        int weight = 0;

        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            weight += 5;
        }

        if (n % 4 == 0 && n % 6 == 0) {
            weight += 4;
        }

        if (n % 2 == 0) {
            weight += 3;
        }

        return weight;
    }

    static void sortBasedOnWeight(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (weight(arr[j]) > weight(arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
    }

    public static void main(String[] args) {

        int[] nums = { 10, 36, 54, 89, 12 };

        for (int i = 0; i < nums.length; i++) {
            System.out.print("<" + nums[i] + "," + weight(nums[i]) + "> ");
        }
        
        sortBasedOnWeight(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static boolean isSqrt(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    private static void sort(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j][1] > arr[j + 1][1]) {

                    // swap number
                    int tempNum = arr[j + 1][0];
                    arr[j + 1][0] = arr[j][0];
                    arr[j][0] = tempNum;

                    // swap number
                    int tempSum = arr[j + 1][1];
                    arr[j + 1][1] = arr[j][1];
                    arr[j][1] = tempSum;

                }
            }
        }
    }
}