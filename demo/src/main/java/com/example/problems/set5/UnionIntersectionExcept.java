package com.example.problems.set5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionIntersectionExcept {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5, 6, 8, 9 };
        int[] arr2 = { 1, 5, 8, 9, 2 };

        // Union: 1,3,4,5,6,8,9,2
        // Intersection: 1,5,8,9
        // Except: 1,3,5,9,8,2 (remove even from list 1 and odd from list 2)

        // int count = findDuplicates(arr1, arr2);

        // int[] res = new int[(arr1.length + arr2.length) - count];
        List<Integer> res = new ArrayList<>();

        union(arr1, arr2, res);
        // intersection(arr1, arr2, res);
        // except(arr1, arr2, res);

        System.out.println(res);

    }

    private static List<Integer> union(int[] arr1, int[] arr2, List<Integer> res) {
        int idx = 0;

        for (int i = 0; i < arr1.length; i++) {
            res.add(idx++, arr1[i]);

        }

        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < idx; j++) {
                if (arr2[i] == res.get(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                res.add(idx++, arr2[i]);
            }
        }

        return res;
    }

    private static List<Integer> intersection(int[] arr1, int[] arr2, List<Integer> res) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    res.add(arr1[i]);
                }
            }
        }

        return res;
    }

    private static List<Integer> except(int[] arr1, int[] arr2, List<Integer> res) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                res.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                res.add(arr2[i]);
            }
        }

        return res;
    }

    private static int findDuplicates(int[] arr1, int[] arr2) {
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        }

        return count;
    }

}
