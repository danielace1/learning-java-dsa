package com.example.problems;

import java.util.Arrays;
import java.util.HashMap;

public class Freq {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 2, 3, 5, 3 };
        int n = arr.length;

        // if (n <= 1) {
        // System.out.println(0);
        // return;
        // }

        // int maxFreq = 1;
        // int currFreq = 1;

        // for (int i = 1; i < n; i++) {
        // if (arr[i] == arr[i - 1]) {
        // currFreq++;
        // } else {
        // if (currFreq > maxFreq) {
        // maxFreq = currFreq;
        // }
        // currFreq = 1;
        // }
        // }

        // if (currFreq > maxFreq) {
        // maxFreq = currFreq;
        // }

        // int min = n - maxFreq;
        // System.out.println(min);

        Arrays.sort(arr);

        int maxCount = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }

        maxCount = Math.max(maxCount, count);

        int ans = n - maxCount;

        System.out.println(ans);

        // System.out.println(usingHashMap(arr, n));
    }

    private static int usingHashMap(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;

        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        int deletions = n - maxFreq;

        return deletions;

    }
}
