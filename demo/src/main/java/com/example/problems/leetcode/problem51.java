package com.example.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/n-queens/
public class problem51 {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        queens(board, 0, ans);

        for (List<String> sol : ans) {
            for (String row : sol) {
                System.out.println(row);
            }
            System.out.println();
        }

    }

    private static void queens(boolean[][] board, int row, List<List<String>> ans) {
        if (row == board.length) {
            ans.add(convert(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                queens(board, row + 1, ans);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    private static List<String> convert(boolean[][] board) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]) {
                    row.append('Q');
                } else {
                    row.append('.');
                }
            }
            list.add(row.toString());
        }

        return list;
    }
}
