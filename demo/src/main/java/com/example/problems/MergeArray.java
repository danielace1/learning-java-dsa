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

        System.out.println(Arrays.toString(ans));

    }
}
