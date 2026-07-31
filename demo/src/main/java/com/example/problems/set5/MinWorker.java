package com.example.problems.set5;

public class MinWorker {
    public static void main(String[] args) {
        // With the starting and ending time of work given find the minimum no of
        // workers needed
        // Start time end time
        // 1230 0130
        // 1200 0100
        // 1600 1700
        // Output:
        // 2

        // 12:00 ---- Job2 ---------------- 1:00

        // 12:30 -------- Job1 ---------------- 1:30

        // 4:00 ---------------- Job3 ---------------- 5:00

        int[] start = { 1200, 1230, 1600 };
        int[] end = { 1300, 1330, 1700 };

        sort(start);
        sort(end);

        int workers = 0;
        int maxWorkers = 0;

        int i = 0, j = 0;

        while (i < start.length) {
            if (start[i] < end[j]) {
                workers++;
                maxWorkers = Math.max(maxWorkers, workers);
                i++;
            } else {
                workers--;
                j++;
            }
        }

        System.out.println(maxWorkers);

    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
