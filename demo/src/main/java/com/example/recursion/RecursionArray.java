package com.example.recursion;

import java.util.ArrayList;

public class RecursionArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 13, 4, 5, 6, 4, 7 };
        // System.out.println(arrsorted(arr, 0));
        // System.out.println(findIndex(arr, 4, 0));
        // System.out.println(findIndexLast(arr, 4, arr.length - 1));

        // findAllIndex(arr, 4, 0);
        // System.out.println(list);

        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);
        // System.out.println(ans);

        // System.out.println(findAllIndex2(arr, 4, 0));

        int[] arr1 = { 1, 5, 2, 6, 4, 7, 3, 10 };
        // int[] arr1 = { 5, 6, 7, 8, 9, 1, 2, 3 };
        System.out.println(rotatedBinary(arr1, 3, 0, arr1.length - 1));

    }

    static boolean arrsorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && arrsorted(arr, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    // find from last
    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    // find all indexes
    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);

    }

    // using array list as ref var in func (use this)
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);

    }

    // list inside func call (not optimized)
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this save ans for current func call, not future or past calls
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFrmBlwCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFrmBlwCalls);

        return list;

    }

    // rotated binary search
    static int rotatedBinary(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return rotatedBinary(arr, target, s, m - 1);
            } else {
                return rotatedBinary(arr, target, m + 1, e);

            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return rotatedBinary(arr, target, m + 1, e);
        }
        return rotatedBinary(arr, target, s, m - 1);

    }
}
