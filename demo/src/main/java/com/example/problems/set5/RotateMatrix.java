package com.example.problems.set5;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },

        };

        // Output:
        // 5 1 2 3
        // 9 10 6 4
        // 13 11 7 8
        // 14 15 16 12

        // rotate clock wise all layers not just outer
        rotate(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] arr) {

        int top = 0;
        int bottom = arr.length - 1;

        int left = 0;
        int right = arr[0].length - 1;

        while (top < bottom && left < right) {

            int temp = arr[top][left];

            // left col
            for (int i = top; i < bottom; i++) {
                arr[i][left] = arr[i + 1][left];
            }

            // bottom row
            for (int j = left; j < right; j++) {
                arr[bottom][j] = arr[bottom][j + 1];
            }

            // right col
            for (int i = bottom; i > top; i--) {
                arr[i][right] = arr[i - 1][right];
            }

            // top row
            for (int j = right; j > left; j--) {
                arr[top][j] = arr[top][j - 1];
            }

            arr[top][left + 1] = temp;

            top++;
            bottom--;
            left++;
            right--;

        }
    }
}
