package com.example.SystemDesignLearning.blackboxgame.models;

public class Board {
    private int rows;
    private int cols;
    private char[][] board;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        board = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void placeAtom(int row, int col) {
        board[row][col] = 'X';
    }

    public boolean hasAtom(int row, int col) {
        return board[row][col] == 'X';
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isInside(int row, int col) {
        return row >= 0 && row < rows &&
                col >= 0 && col < cols;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public char[][] getBoard() {
        return board;
    }

}
