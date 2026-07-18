package com.example.problems.leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/assign-cookies/
public class Problem455 {
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            // sort(g);
            // sort(s);

            Arrays.sort(g);
            Arrays.sort(s);

            int child = 0;
            int cookie = 0;

            while (child < g.length && cookie < s.length) {
                if (s[cookie] >= g[child]) {
                    child++;
                }

                cookie++;
            }

            return child;

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
