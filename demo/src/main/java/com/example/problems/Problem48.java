package com.example.problems;

// https://leetcode.com/problems/rotate-image/
public class Problem48 {
    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    swap(matrix, i, j, j, i);
                }
            }

            for (int i = 0; i < n; i++) {
                int left = 0;
                int right = n - 1;

                while (left < right) {
                    swap(matrix, i, left, i, right);
                    left++;
                    right--;
                }
            }
        }

        private static void swap(int[][] mat, int r1, int c1, int r2, int c2) {
            int temp = mat[r1][c1];
            mat[r1][c1] = mat[r2][c2];
            mat[r2][c2] = temp;
        }
    }
}
