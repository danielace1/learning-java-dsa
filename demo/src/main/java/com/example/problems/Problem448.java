package com.example.problems;

import java.util.ArrayList;
import java.util.List;

// all missing num - cyclic sort (google qn)
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class Problem448 {

    public List<Integer> findDisappearedNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        // find missing nums
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(j + 1);
            }
        }

        return ans;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
