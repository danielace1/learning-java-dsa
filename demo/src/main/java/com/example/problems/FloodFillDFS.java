package com.example.problems;

public class FloodFillDFS {
    static void fillWithColor(int[][] matrix, int row, int col, int newColor) {
        int oldColor = matrix[row][col];

        if (oldColor == newColor) {
            return;
        }

        fill(matrix, row, col, oldColor, newColor);
    }

    static void fill(int[][] matrix, int row, int col, int oldColor, int newColor) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return;
        }

        if (matrix[row][col] != oldColor) {
            return;
        }

        matrix[row][col] = newColor;

        fill(matrix, row - 1, col, oldColor, newColor);

        fill(matrix, row + 1, col, oldColor, newColor);

        fill(matrix, row, col - 1, oldColor, newColor);

        fill(matrix, row, col + 1, oldColor, newColor);

    }

    public static void main(String[] args) {

        int[][] matrix = {
                { 0, 0, 0, 0, 0 },
                { 0, 1, 1, 0, 0 },
                { 0, 1, 1, 1, 0 },
                { 0, 0, 1, 0, 0 }
        };

        System.out.println("Before:");
        printMatrix(matrix);

        // row = 1, col = 1
        // Change connected 1's to 2
        fillWithColor(matrix, 1, 1, 2);

        // Print after filling
        System.out.println("\nAfter:");
        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
