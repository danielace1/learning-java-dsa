package com.systemdesign.tictactoe;

import java.util.*;

public class Main {

    private static char[][] board;
    private static int n;
    private static char currentPlayer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.print("Enter size of grid (n x n): ");
        n = scanner.nextInt();

        board = new char[n][n];

        initializeBoard(board);

        currentPlayer = 'X';
        int moves = 0;

        boolean gameOver = false;

        while (moves < n * n && !gameOver) {
            printBoard();

            System.out.printf("Player %c, enter your move (row and col): ", currentPlayer);
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                moves++;

                if (checkWin(row, col)) {
                    gameOver = true;
                    printBoard();
                    System.out.printf("Player %c wins!%n", currentPlayer);
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Try again!");
            }
        }

        if (!gameOver) {
            printBoard();
            System.out.println("The match is draw!");
        }

        scanner.close();

    }

    private static boolean checkWin(int row, int col) {
        return checkRow(row) || checkCol(col) || checkDiagonals();
    }

    private static boolean checkRow(int row) {
        for (int col = 0; col < n; col++) {
            if (board[row][col] != currentPlayer) {
                return false;
            }
        }

        return true;
    }

    private static boolean checkCol(int col) {
        for (int row = 0; row < n; row++) {
            if (board[row][col] != currentPlayer) {
                return false;
            }
        }

        return true;
    }

    private static boolean checkDiagonals() {
        boolean diag1 = true, diag2 = true;

        for (int i = 0; i < n; i++) {
            if (board[i][i] != currentPlayer) {
                diag1 = false;
            }

            if (board[i][n - i - 1] != currentPlayer) {
                diag2 = false;
            }
        }

        return diag1 || diag2;
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < n && board[row][col] == '-';
    }

    private static void initializeBoard(char[][] board) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = '-';
            }
            System.out.println();
        }
    }

    private static void printBoard() {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
