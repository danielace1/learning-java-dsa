package com.example.problems.set3;

import java.util.Arrays;

public class OddAndEvenSort {
    public static void main(String[] args) {
        int[] arr = { 13, 2, 4, 15, 12, 10, 5 };
        // 13,2,12,10,5,15,4

        // 1, 2, 3, 4, 5, 6, 7, 8, 9
        // 9,2,7,4,5,6,3,8,1

        int oddCount = (arr.length + 1) / 2;
        int evenCount = arr.length / 2;

        int[] odd = new int[oddCount];
        int[] even = new int[evenCount];

        int ei = 0, oi = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                odd[oi++] = arr[i];
            } else {
                even[ei++] = arr[i];
            }
        }

        sortDes(odd);
        
        sortAsc(even);

        oi = 0;
        ei = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = odd[oi++];
            } else {
                arr[i] = even[ei++];
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void sortAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    private static void sortDes(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
