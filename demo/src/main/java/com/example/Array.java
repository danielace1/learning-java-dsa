package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // String[] names = new String[4];

        // for (int i = 0; i < names.length; i++) {
        // names[i] = in.next();
        // }

        // System.out.println(Arrays.toString(names));

        // names[1] = "Alice";

        // System.out.println(Arrays.toString(names));

        // Matrix

        // int[][] mat1 = new int[3][3];

        // int[][] matrix = {
        // { 1, 2, 3 },
        // { 4, 5, },
        // { 6, 7, 8, 9 }
        // };

        // for (int i = 0; i < mat1.length; i++) {
        // for (int j = 0; j < mat1[i].length; j++) {
        // mat1[i][j] = in.nextInt();
        // }

        // }

        // for (int i = 0; i < mat1.length; i++) {
        // for (int j = 0; j < mat1[i].length; j++) {
        // System.out.print(mat1[i][j] + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < mat1.length; i++) {
        // System.out.println(Arrays.toString(mat1[i]));
        // }

        // for (int[] a : mat1) {
        // System.out.println(Arrays.toString(a));
        // }

        // ArrayList<Integer> list = new ArrayList<>(5);

        // for (int i = 0; i < 5; i++) {
        // list.add(in.nextInt());
        // }

        // for (int i = 0; i < 5; i++) {
        // System.out.print(list.get(i) + " ");
        // }

        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialize
        // for (int i = 0; i < 3; i++) {
        // list.add(new ArrayList<>());
        // }

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // list.get(i).add(in.nextInt());
        // }
        // }
        // System.out.println(list);

        int[] arr = { 1, 33, 23, 9, 18 };
        // swap(arr, 2, 3);
        // System.out.println(max(arr, 1, 3));

        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    // static int max(int[] arr, int start, int end) {

    // if (end > start) {
    // return -1;
    // }

    // if (arr == null) {
    // return -1;
    // }

    // int maxVal = arr[start];
    // for (int i = start; i <= end; i++) {
    // if (arr[i] > maxVal) {
    // maxVal = arr[i];
    // }
    // }

    // return maxVal;
    // }

    static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
