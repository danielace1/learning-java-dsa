package com.example.problems;

import java.util.Arrays;

public class ArrangeEvenOdd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 15, 6 };
        int[] ans = new int[arr.length];

        // even on left, odd on right
        // Possible outputs:
        // [2, 4, 6, 1, 3, 15]
        // [6, 2, 4, 3, 15, 1]

        int l = 0;
        int r = arr.length - 1;

        // 0
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // ans[l++] = arr[i];
        // } else {
        // ans[r--] = arr[i];
        // }
        // }

        // 1
        // int p = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // int temp = arr[i];
        // arr[i] = arr[p];
        // arr[p] = temp;
        // p++;
        // }
        // }

        // 2
        int idx = 0;

        for (int x : arr) {
            if (x % 2 == 0) {
                ans[idx++] = x;
            }
        }

        for (int x : arr) {
            if (x % 2 != 0) {
                ans[idx++] = x;
            }
        }

        // 3
        while (l < r) {
            if (arr[l] % 2 == 0) {
                l++;
            }

            else if (arr[r] % 2 != 0) {
                r--;
            }

            else {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }

        }

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(arr));

    }
}
