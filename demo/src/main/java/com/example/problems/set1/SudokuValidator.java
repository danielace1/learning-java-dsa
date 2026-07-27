package com.example.problems.set1;

public class SudokuValidator {
    public static void main(String[] args) {

        int[][] board = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 4, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        if (isValidSudoku(board)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }

    private static boolean isValidSudoku(int[][] board) {
        return checkRow(board) && checkCol(board) && checkBoxes(board);
    }

    private static boolean checkBoxes(int[][] board) {

        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                boolean[] seen = new boolean[10];

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        int num = board[i][j];

                        if (num == 0) {
                            continue;
                        }

                        if (seen[num]) {
                            return false;
                        }

                        seen[num] = true;
                    }
                }
            }
        }

        return true;

    }

    private static boolean checkRow(int[][] board) {

        for (int i = 0; i < 9; i++) {

            boolean[] seen = new boolean[10];

            for (int j = 0; j < 9; j++) {
                int num = board[i][j];

                if (num == 0) {
                    continue;
                }

                if (seen[num]) {
                    return false;
                }

                seen[num] = true;
            }
        }

        return true;

    }

    private static boolean checkCol(int[][] board) {
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[10];

            for (int i = 0; i < 9; i++) {
                int num = board[i][j];

                if (num == 0) {
                    continue;
                }
                if (seen[num]) {
                    return false;
                }

                seen[num] = true;
            }
        }

        return true;
    }

}
