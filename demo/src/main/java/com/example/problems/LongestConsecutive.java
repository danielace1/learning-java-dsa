package com.example.problems;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {
        // [100, 4, 200, 1, 3, 2] → longest consecutive sequence is 1, 2, 3, 4, so the
        // answer is 4.
        int[] arr = { 100, 4, 200, 1, 3, 2 };

        // normalMethod(arr);
        hashSet(arr);

    }

    private static void normalMethod(int[] arr) {
        if (arr.length == 0) {
            System.out.println(0);
            return;
        }

        Arrays.sort(arr);

        int longest = 1;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else if (arr[i] == arr[i - 1]) {
                continue;
            } else {
                count = 1;
            }

            longest = Math.max(longest, count);
        }

        System.out.println(longest);

    }

    private static void hashSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLen = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLen++;
                }

                longest = Math.max(longest, currentLen);
            }
        }

        System.out.println(longest);

    }

}
