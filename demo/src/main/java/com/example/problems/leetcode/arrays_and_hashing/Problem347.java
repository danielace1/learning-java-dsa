package com.example.problems.leetcode.arrays_and_hashing;

import java.util.HashMap;

public class Problem347 {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                pq.offer(entry);

                if (pq.size() > k) {
                    pq.poll();
                }
            }

            int[] res = new int[k];

            for (int i = 0; i < k; i++) {
                res[i] = pq.poll().getKey();
            }

            return res;
        }
    }
}
