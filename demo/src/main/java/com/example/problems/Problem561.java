package com.example.problems;

import java.util.Arrays;

// https://leetcode.com/problems/array-partition
public class Problem561 {
    class Solution {
        public int arrayPairSum(int[] nums) {
            // sort(nums);

            Arrays.sort(nums);
            int sum = 0;
            for (int i = 0; i < nums.length; i += 2) {
                sum += nums[i];
            }

            return sum;

        }

        // private static void sort(int[] arr){
        // for(int i=0;i<arr.length-1;i++){
        // for(int j=i+1;j>0;j--){
        // if(arr[j]<arr[j-1]){
        // swap(arr,j,j-1);
        // }else {
        // break;
        // }
        // }
        // }
        // }

        // private static void swap(int[] arr, int f,int s){
        // int temp=arr[f];
        // arr[f]=arr[s];
        // arr[s]=temp;
        // }
    }
}
