package com.example.problems;

public class EulerGraph {
    public static void main(String[] args) {
        int n = 5; // nodes;
        int[][] edges = {
                { 1, 2, 1 },
                { 1, 3, 1 },
                { 1, 4, 1 },
                { 1, 5, 1 },
                { 2, 3, 1 },
                { 2, 4, 1 },
                { 2, 5, 1 },
                { 3, 4, 1 },
                { 3, 5, 1 },
                { 4, 5, 1 },
        }; // 10 edges // YES

        // int[][] edges = {
        // { 1, 2, 2 },
        // { 1, 3, 1 },
        // { 1, 4, 2 },
        // { 2, 3, 2 },
        // { 2, 4, 1 },
        // { 3, 4, 2 },
        // }; NO

        // euler graph means
        // all nodes have even deg

        int[] degree = new int[n + 1]; // degree array

        for (int[] edge : edges) {
            degree[edge[0]]++; // even
            degree[edge[1]]++; // odd

        }

        int odd = 0;
        int firstOddNode = -1;

        for (int i = 1; i <= n; i++) {
            if (degree[i] % 2 != 0) {
                odd++;

                if (firstOddNode == -1) {
                    firstOddNode = i;
                }
            }
        }

        if (odd == 0) {
            // all vertices have even deg
            System.out.println("YES 1");
        } else if (odd == 2) {
            // exactly two vertices have even deg rest odd
            System.out.println("YES " + firstOddNode);
        } else {
            System.out.println("NO");
        }

    }
}
