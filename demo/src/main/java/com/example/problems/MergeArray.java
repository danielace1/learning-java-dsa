package com.example.problems;

import java.util.Arrays;

public class MergeArray {
    // already sorted arr so dont sort
    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 11, 17 }; // asc
        int[] arr2 = { 13, 8, 5 }; // des

        int[] ans = new int[arr1.length + arr2.length];

        boolean arr1Asc = arr1[0] <= arr1[arr1.length - 1];
        boolean arr2Asc = arr2[0] <= arr2[arr2.length - 1];

        int i = arr1Asc ? 0 : arr1.length - 1;
        int j = arr2Asc ? 0 : arr2.length - 1;

        int k = 0;

        while ((arr1Asc ? i < arr1.length : i >= 0) &&
                (arr2Asc ? j < arr2.length : j >= 0)) {

            if (arr1[i] <= arr2[j]) {
                ans[k++] = arr1[i];
                i = arr1Asc ? i + 1 : i - 1;
            } else {
                ans[k++] = arr2[j];
                j = arr2Asc ? j + 1 : j - 1;
            }
        }

        while (arr1Asc ? i < arr1.length : i >= 0) {
            ans[k++] = arr1[i];
            i = arr1Asc ? i + 1 : i - 1;
        }

        while (arr2Asc ? j < arr2.length : j >= 0) {
            ans[k++] = arr2[j];
            j = arr2Asc ? j + 1 : j - 1;
        }

        // System.out.println(Arrays.toString(ans));

        mergeNormal(arr1, arr2);

    }

    private static void mergeNormal(int[] arr1, int[] arr2) {
        sort(arr1);
        sort(arr2);

        int[] res = new int[arr1.length + arr2.length];

        int n = arr1.length - 1;
        int m = arr2.length - 1;
        int k = res.length - 1;

        while (n >= 0 && m >= 0) {
            if (arr1[n] > arr2[m]) {
                res[k--] = arr1[n--];
            } else {
                res[k--] = arr2[m--];
            }
        }

        while (n >= 0) {
            res[k--] = arr1[n--];
        }

        while (m >= 0) {
            res[k--] = arr2[m--];
        }

        System.out.println(Arrays.toString(res));

    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
