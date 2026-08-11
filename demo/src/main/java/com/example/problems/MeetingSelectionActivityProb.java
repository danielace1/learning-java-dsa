package com.example.problems;

public class MeetingSelectionActivityProb {
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] finish = { 2, 4, 6, 7, 9, 9, }; // should be sorted

        int end = -1;

        for (int i = 0; i < start.length; i++) {
            if (start[i] >= end) {
                System.out.print((i + 1) + " ");
                end = finish[i];
            }
        }

    }
}
