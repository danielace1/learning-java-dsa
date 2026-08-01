package com.example.problems.set5;

import java.util.ArrayList;
import java.util.List;

public class LargestPossiblePrime {
    public static void main(String[] args) {
        int n = 4691;
        // op: 9641

        int[] permutations = permutations(n);

        int largestPrime = -1;

        for (int num : permutations) {
            if (isPrime(num)) {
                largestPrime = Math.max(largestPrime, num);
            }
        }

        System.out.println(largestPrime);

    }

    private static int[] permutations(int n) {
        String str = String.valueOf(n);

        List<Integer> res = new ArrayList<>();

        generate(str.toCharArray(), 0, res);

        int[] arr = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }

        return arr;
    }

    private static void generate(char[] digits, int idx, List<Integer> res) {
        if (idx == digits.length) {
            int num = Integer.parseInt(new String(digits));
            res.add(num);
            return;
        }

        for (int i = idx; i < digits.length; i++) {
            swap(digits, idx, i); // choose

            generate(digits, idx + 1, res); // explore

            // backtrack
            swap(digits, idx, i);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
