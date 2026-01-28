package com.example.problems;

// missing number - cyclic sort (amazon qn)
public class Problem268java {
    public static void main(String[] args) {

    }

    public int missingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        // search for missing el
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        // case 2
        return arr.length;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}