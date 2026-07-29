package com.example.problems.set3;

import java.util.Arrays;

public class MergeSortArrNoRepeat {
    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 5, 6, 7, 9, 10, 13 };
        int[] arr2 = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };

        // 2,3,4,5,6,7,8,9,10,11,13,15
        // normalMethod(arr1, arr2);

        improvedMethod(arr1, arr2);

    }

    private static void normalMethod(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        }

        int[] ans = new int[(arr1.length + arr2.length) - count];

        int n = arr1.length - 1;
        int m = arr2.length - 1;
        int k = ans.length - 1;

        while (n >= 0 && m >= 0) {

            if (arr1[n] == arr2[m]) {
                ans[k--] = arr1[n--];
                m--;
            } else if (arr1[n] > arr2[m]) {
                ans[k--] = arr1[n--];
            } else {
                ans[k--] = arr2[m--];
            }
        }

        while (n >= 0) {
            ans[k--] = arr1[n--];
        }

        while (m >= 0) {
            ans[k--] = arr2[m--];
        }

        System.out.println(Arrays.toString(ans));

    }

    private static void improvedMethod(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (k == 0 || ans[k - 1] != arr1[i]) {
                    ans[k++] = arr1[i];
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (k == 0 || ans[k - 1] != arr2[j]) {
                    ans[k++] = arr2[j];
                }
                j++;
            } else {
                if (k == 0 || ans[k - 1] != arr1[i]) {
                    ans[k++] = arr1[i];
                }
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (k == 0 || ans[k - 1] != arr1[i]) {
                ans[k++] = arr1[i];
            }
            i++;
        }

        while (j < arr2.length) {
            if (k == 0 || ans[k - 1] != arr2[j]) {
                ans[k++] = arr2[j];
            }
            j++;
        }

        System.out.println(Arrays.toString(Arrays.copyOf(ans, k)));
    }

}
