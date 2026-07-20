package com.example.problems.leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/
public class Problem88 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 11, 17 };
        int[] arr2 = { 13, 8, 5 };

        int[] ans = new int[arr1.length + arr2.length];

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = ans.length - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                ans[k--] = arr1[i--];
            } else {
                ans[k--] = arr2[j--];
            }
        }

        while (i >= 0) {
            ans[k--] = arr1[i--];
        }

        while (j >= 0) {
            ans[k--] = arr2[j--];
        }

        // System.out.println(Arrays.toString(ans));

        // while(i>=0 && j>=0){
        // if(nums1[i]>nums2[j]){
        // nums1[k--]=nums1[i--];
        // }else {
        // nums1[k--]=nums2[j--];
        // }
        // }

        // while(j>=0){
        // nums1[k--]=nums2[j--];
        // }

    }
}
