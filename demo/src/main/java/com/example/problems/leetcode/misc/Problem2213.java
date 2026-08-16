package com.example.problems.leetcode.misc;

// https://leetcode.com/problems/longest-substring-of-one-repeating-character
public class Problem2213 {
    class Solution {

        class Node {
            char leftChar;
            char rightChar;

            int prefix;
            int suffix;
            int best;
            int len;

            Node() {
                len = 0;
            }

            Node(char c) {
                leftChar = c;
                rightChar = c;
                prefix = 1;
                suffix = 1;
                best = 1;
                len = 1;
            }
        }

        Node[] tree;

        Node merge(Node a, Node b) {
            if (a.len == 0)
                return b;
            if (b.len == 0)
                return a;

            Node res = new Node();

            res.len = a.len + b.len;

            res.leftChar = a.leftChar;
            res.rightChar = b.rightChar;

            res.prefix = a.prefix;
            res.suffix = b.suffix;

            res.best = Math.max(a.best, b.best);

            if (a.rightChar == b.leftChar) {
                res.best = Math.max(res.best, a.suffix + b.prefix);

                if (a.prefix == a.len) {
                    res.prefix = a.len + b.prefix;
                }

                if (b.suffix == b.len) {
                    res.suffix = b.len + a.suffix;
                }
            }

            return res;
        }

        void build(int node, int left, int right, String s) {
            if (left == right) {
                tree[node] = new Node(s.charAt(left));
                return;
            }

            int mid = (left + right) / 2;

            build(node * 2, left, mid, s);
            build(node * 2 + 1, mid + 1, right, s);

            tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
        }

        void update(int node, int left, int right, int pos, char c) {
            if (left == right) {
                tree[node] = new Node(c);
                return;
            }

            int mid = (left + right) / 2;

            if (pos <= mid) {
                update(node * 2, left, mid, pos, c);
            } else {
                update(node * 2 + 1, mid + 1, right, pos, c);
            }

            tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
        }

        public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
            int n = s.length();

            tree = new Node[4 * n];

            build(1, 0, n - 1, s);

            int k = queryIndices.length;
            int[] ans = new int[k];

            for (int i = 0; i < k; i++) {
                int pos = queryIndices[i];
                char c = queryCharacters.charAt(i);

                update(1, 0, n - 1, pos, c);

                ans[i] = tree[1].best;
            }
            return ans;
        }
    }
}
