package com.example.problems;

import java.util.ArrayList;

// https://leetcode.com/problems/merge-intervals/
public class Problem56 {
    class Solution {
        public int[][] merge(int[][] intervals) {

            bubbleSort(intervals);
            ArrayList<int[]> ans = new ArrayList<>();

            int start = intervals[0][0];
            int end = intervals[0][1];

            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] <= end) {
                    end = Math.max(end, intervals[i][1]);
                } else {
                    ans.add(new int[] { start, end });
                    start = intervals[i][0];
                    end = intervals[i][1];
                }
            }

            ans.add(new int[] { start, end });

            return ans.toArray(new int[ans.size()][]);
        }

        private static void bubbleSort(int[][] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j][0] > arr[j + 1][0]) {
                        int[] temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
}
