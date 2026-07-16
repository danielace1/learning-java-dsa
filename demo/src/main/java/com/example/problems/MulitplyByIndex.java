package com.example.problems;

import java.util.Arrays;

public class MulitplyByIndex {
    public static void main(String[] args) {
        String size = "4";
        String input = "3 4 5 6 1";

        String[] arr = input.split(" ");

        sort(arr);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]) * i;
        }

        System.out.println(sum);

    }

    private static void sort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (Integer.parseInt(arr[j]) < Integer.parseInt(arr[j + 1])) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
