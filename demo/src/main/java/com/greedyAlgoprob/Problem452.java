package com.greedyAlgoprob;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/
public class Problem452 {
    public int findMinArrowShots(int[][] points) {

        // sort(points);
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int end = points[0][1];

        int arrow = 1;
        for (int i = 0; i < points.length; i++) {
            if (end < points[i][0]) {
                arrow++;
                end = points[i][1];
            }
        }

        return arrow;
    }
}
