package com.example;

public class Recursion {
    public static void main(String[] args) {
        // message();
        // messages(1);
        // System.out.println(fibo(5));

        int[] arr = { 1, 5, 6, 78, 100 };

        System.out.println("Found: " + search(arr, 6, 0, arr.length));
    }

    static void message() {
        System.out.println("Hello World!");
        message1();
    }

    static void message1() {
        System.out.println("Hello World!");
    }

    static void messages(int n) {
        if (n == 5) {
            // System.out.println(5);
            return;
        }

        System.out.println(n);
        messages(n + 1);
    }

    // fibonacci series
    static int fibo(int n) {

        if (n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    // BS
    static int search(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid])
            return search(arr, target, s, mid - 1);

        return search(arr, target, mid + 1, e);

    }
}
