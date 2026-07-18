package com.example.problems.leetcode;

import java.util.List;

// https://leetcode.com/problems/maximum-distance-in-arrays/
public class Problem624 {
    class Solution {
        public int maxDistance(List<List<Integer>> arrays) {
            int distance = 0;

            List<Integer> first = arrays.get(0);

            int globalMin = arrays.get(0).get(0);
            int globalMax = arrays.get(0).get(first.size() - 1);

            int currentMin = Integer.MAX_VALUE;
            int currentMax = Integer.MIN_VALUE;

            for (int i = 1; i < arrays.size(); i++) {
                List<Integer> current = arrays.get(i);

                currentMin = current.get(0);
                currentMax = current.get(current.size() - 1);

                distance = Math.max(distance, currentMax - globalMin);
                distance = Math.max(distance, globalMax - currentMin);

                globalMin = Math.min(globalMin, currentMin);
                globalMax = Math.max(globalMax, currentMax);
            }

            return distance;
        }
    }
}
