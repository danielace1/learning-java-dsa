package com.example.problems.leetcode.binary_search;

// https://leetcode.com/problems/search-a-2d-matrix/
public class Problem74 {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }

            return false;
        }
    }
}
