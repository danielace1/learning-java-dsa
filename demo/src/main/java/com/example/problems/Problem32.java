package com.example.problems;

public class Problem32 {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private static boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            // if you found empty el then break
            if (emptyLeft == false) {
                break;
            }
        }

        if (emptyLeft == true) {
            return true;
            // sudoku solved
        }

        // backtrack
        for (char ch = '1'; ch <= '9'; ch++) {
            if (isSafe(board, row, col, ch)) {
                board[row][col] = ch;
                if (solve(board)) {
                    return true;
                } else {
                    // bactrack
                    board[row][col] = '.';
                }
            }
        }

        return false;

    }

    static boolean isSafe(char[][] board, int row, int col, char character) {
        // check the row
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row
            if (board[row][i] == character) {
                return false;
            }
        }

        // check the col, same col, each row
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == character) {
                return false;
            }
        }

        // Check 3x3 box
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - (row % sqrt);
        int colStart = col - (col % sqrt);

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == character) {
                    return false;
                }
            }
        }

        return true;
    }

}
