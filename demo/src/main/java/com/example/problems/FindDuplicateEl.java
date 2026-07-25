package com.example.problems;

public class FindDuplicateEl {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 4, 5, 6, 7, 9 };
        int[] arr2 = { 1, 0, 7, 9 };

        System.out.println("Duplicate Element");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr2[j] + " ");
                }
            }
        }

    }
}
