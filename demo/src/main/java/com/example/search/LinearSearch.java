package com.example.search;

import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {

        // int[] arr = { 2, 1, 4, 8, 5, 6, 7, 3, 9 };
        // int target = 2;

        // int ans = linearSearch(arr, target);
        // System.out.println(ans);

        // String name = "Sudharsan";
        // char target = 's';

        // System.out.println(Arrays.toString(name.toCharArray()));
        // System.out.println(Search(name, target));

        // System.out.println("min:" + min(arr));

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6, 7 },
                { 10, 100, 12, 16 }
        };

        int target = 16;

        // int[] ans = Search2D(arr, target); // format of return val {row-i,col-j}

        // System.out.println("2d Search" + Arrays.toString(ans));

        System.out.println("MAX 2d: " + max2D(arr));
    }

    static int max2D(int[][] arr) {
        int max = arr[0][0]; // Integer.MIN_VALUE;

        for (int[] element : arr) {
            for (int element2 : element) {
                if (element2 > max) {
                    max = element2;
                }
            }
        }

        return max;

    }

    static int[] Search2D(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }

    static int min(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    static boolean Search(String str, char target) {

        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        // for (int i = 0; i < str.length(); i++) {
        // if (target == str.charAt(i)) {
        // return true;
        // }
        // }

        return false;

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int el : arr) {
            if (el == target) {
                return el;
            }

        }

        return Integer.MAX_VALUE;

    }

}
