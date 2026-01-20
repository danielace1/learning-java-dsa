package com.example.problems;


// This is the soln for problem 162 also
public class Problem852 {
    public static void main(String[] args) {

    }

    static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;

            } else {
                start = mid + 1;
            }

        }
        return start;
    }
}
