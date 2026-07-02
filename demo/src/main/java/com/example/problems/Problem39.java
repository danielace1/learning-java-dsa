package com.example.problems;

// https://leetcode.com/problems/combination-sum/
import java.util.ArrayList;
import java.util.List;

public class Problem39 {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();

            helper(0, candidates, target, new ArrayList<>(), ans);
            return ans;

        }

        private static void helper(int index, int[] arr, int target, List<Integer> current, List<List<Integer>> ans) {

            if (index == arr.length) {
                if (target == 0) {
                    ans.add(new ArrayList<>(current));
                }
                return;
            }

            if (arr[index] <= target) {
                current.add(arr[index]);
                helper(index, arr, target - arr[index], current, ans);
                current.remove(current.size() - 1);
            }

            helper(index + 1, arr, target, current, ans);

        }
    }
}
