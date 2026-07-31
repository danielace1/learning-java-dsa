package com.example.problems.set4;

import java.util.ArrayList;
import java.util.List;

public class SumOfSet {
    public static void main(String[] args) {
        int[] set1 = { 7, 2, 3, 4, 5, 3, 1, 2, 7, 2, 8 };
        int[] set2 = { 1, 2, 3 };
        // 1, 0, 1, 1, 0
        // [7, 2, 3, 4, 5, 3, 1, 2, 8, 5, 1]

        System.out.println(sum(set1, set2));

    }

    private static List<Integer> sum(int[] set1, int[] set2) {
        int i = set1.length - 1;
        int j = set2.length - 1;

        int carry = 0;

        List<Integer> ans = new ArrayList<>();

        while (i >= 0 || j >= 0 || carry > 0) {

            int digit1 = (i >= 0) ? set1[i] : 0;
            int digit2 = (j >= 0) ? set2[j] : 0;

            int sum = digit1 + digit2 + carry;

            ans.add(0, sum % 10);

            carry = sum / 10;

            i--;
            j--;
        }

        return ans;

    }
}
