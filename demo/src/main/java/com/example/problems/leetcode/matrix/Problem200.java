package com.example.problems.leetcode.matrix;

// https://leetcode.com/problems/number-of-islands
public class Problem200 {
    class Solution {
        public int numIslands(char[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int count = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') {
                        count++;
                        dfs(grid, i, j);
                    }
                }
            }

            return count;
        }

        private static void dfs(char[][] grid, int i, int j) {
            int m = grid.length;
            int n = grid[0].length;
            if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
                return;
            }

            grid[i][j] = '0';

            dfs(grid, i - 1, j); // up
            dfs(grid, i + 1, j); // down
            dfs(grid, i, j - 1); // left
            dfs(grid, i, j + 1); // right
        }
    }
}
