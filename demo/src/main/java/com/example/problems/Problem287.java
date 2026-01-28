package com.example.problems;

// https://leetcode.com/problems/find-the-duplicate-number/
// cyclic sort - finding duplicate num
public class Problem287 {
    public int findDuplicate(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }

        return arr.length;

    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
