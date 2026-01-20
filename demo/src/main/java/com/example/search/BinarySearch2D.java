package com.example.search;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        // int[][] arr = {
        // { 10, 20, 30, 40 },
        // { 15, 25, 35, 45 },
        // { 28, 29, 37, 49 },
        // { 33, 34, 38, 50 }
        // };

        // System.out.println(Arrays.toString(search(arr, 0)));

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(Arrays.toString(sortedMatrixSearch(arr, 9)));

    }

    static int[] sortedMatrixSearch(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length; // careful

        if (rows == 1) {
            return binary(arr, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run loop till 2 rows remaining
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (arr[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }

            if (arr[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }

        }

        // checking target in col of 2 rows

        if (arr[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }

        if (arr[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        // search in remoining halves
        if (target <= arr[rStart][cMid - 1]) {
            return binary(arr, rStart, 0, cMid - 1, target);
        }

        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
            return binary(arr, rStart, cMid + 1, cols - 1, target);
        }

        if (target <= arr[rStart + 1][cMid - 1]) {
            return binary(arr, rStart + 1, 0, cMid - 1, target);
        } else {
            return binary(arr, rStart + 1, cMid + 1, cols - 1, target);
        }

    }

    // search in row of cols
    static int[] binary(int[][] arr, int row, int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (arr[row][mid] == target) {
                return new int[] { row, mid };
            }

            if (arr[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }

        }

        return new int[] { -1, -1 };

    }

    static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[] { r, c };
            }

            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return new int[] { -1, -1 };
    }
}
