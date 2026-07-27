package com.example.problems;

import java.util.Arrays;

public class SortWithoutFunc {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2, 1, 1, 0, 2, 2, 0 };

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int num : arr) {
            if (num == 0) {
                zero++;
            } else if (num == 1) {
                one++;
            } else if (num == 2) {
                two++;
            }
        }

        int idx = 0;

        while (zero-- > 0) {
            arr[idx++] = 0;
        }

        while (one-- > 0) {
            arr[idx++] = 1;
        }

        while (two-- > 0) {
            arr[idx++] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }
}
