package com.example.problems;

import java.util.Arrays;

public class PrintRectangle {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 6 },
                { 5, 3, 8, 1, 2 },
                { 4, 6, 7, 5, 5 },
                { 2, 4, 8, 9, 4 } };

        // index = (2, 0) and (3, 4)

        int r1 = 2;
        int c1 = 0;

        int r2 = 3;
        int c2 = 4;

        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            System.out.print("{ ");
            for (int j = c1; j <= c2; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];

            }
            System.out.print("}");
            System.out.println();
        }

        System.out.println(sum);
    }
}
