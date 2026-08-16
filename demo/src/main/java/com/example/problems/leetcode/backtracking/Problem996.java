package com.example.problems.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem996 {
    class Solution {
        int count = 0;

        public int numSquarefulPerms(int[] nums) {
            Arrays.sort(nums);
            boolean[] used = new boolean[nums.length];
            backtrack(nums, new ArrayList<>(), used);

            return count;
        }

        private void backtrack(int[] arr, List<Integer> temp, boolean[] used) {
            if (temp.size() == arr.length) {
                count++;
                return;
            }

            for (int i = 0; i < arr.length; i++) {

                if (used[i]) {
                    continue;
                }

                if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) {
                    continue;
                }
                ;

                if (!temp.isEmpty()) {
                    int sum = temp.get(temp.size() - 1) + arr[i];
                    int root = (int) Math.sqrt(sum);

                    if (root * root != sum) {
                        continue;
                    }
                }

                used[i] = true;
                temp.add(arr[i]);

                backtrack(arr, temp, used);

                
                temp.remove(temp.size() - 1);
                used[i] = false;
            }
        }

    }
}
