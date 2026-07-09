package com.example.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Problem349 {
    public static void main(String[] args) {

    }

    private static int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        int[] ans = new int[set2.size()];
        int i = 0;

        for (int num : set2) {
            ans[i++] = num;
        }

        return ans;

    }
}
