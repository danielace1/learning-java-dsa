package com.example.search;

public class BinarySearch {
    public static void main(String[] args) {

        // int[] arr = { 20, 0, 1, 3, 4, 5, 6, 7, 8, 9, 10 };

        // int[] arr = { 90, 80, 75, 22, 11, 10, 5, 2, -3 };

        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };

        int target = 15;
        // int ans = binarySearch(arr, target);

        // System.out.println("Binary Search: " + ans);

        // int ans = orderAgnosticBS(arr, target);

        // System.out.println("Order Agnostic: " + ans);

        System.out.println("Ceiling: " + ceiling(arr, target));
        System.out.println("Floor: " + floor(arr, target));

    }

    // smallest num > or = target
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]) {
            return -1;
        }

        while (start <= end) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }

        return start;
    }

    // biggest num < or = target
    static int floor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        

        while (start <= end) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }

        return end;
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }

        return -1;
    }
}
