package com.example.problems.leetcode;

// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
public class Problem1423 {
    class Solution {
        public int maxScore(int[] cardPoints, int k) {

            int sum = 0;

            for (int i = 0; i < cardPoints.length; i++) {
                sum += cardPoints[i];
            }

            // window size
            int n = cardPoints.length - k;

            if (n == 0) {
                return sum;
            }

            int windowSum = 0;

            for (int i = 0; i < n; i++) {
                windowSum += cardPoints[i];
            }

            int minWindow = windowSum;

            for (int i = n; i < cardPoints.length; i++) {
                windowSum += cardPoints[i];
                windowSum -= cardPoints[i - n];

                minWindow = Math.min(minWindow, windowSum);
            }

            return sum - minWindow;
        }

    }
}
