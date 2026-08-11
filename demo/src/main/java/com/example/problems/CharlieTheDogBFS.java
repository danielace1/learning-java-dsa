package com.example.problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CharlieTheDogBFS {

    // Charlie the Dog
    // Have the function

    // CharListheting (stcarz)

    // read the array of strings stored in strarr which will be a 4x4 matrix of the
    // characters 'C', H. 'F', 'O', where C represents Charlie the dog. H represents
    // its home, F represents dog food, and O represents and empty space in the
    // grid. Your goal is to figure out the least amount of moves required to get
    // Charlie to grab each piece of food in the grid by moving up, down, left, or
    // right, and then make it home right after. Charlie cannot move onto the home
    // before all pieces of food have been collected. For example: if thesis
    // ["FOOF", "OCOO", "OOOH", "FOOO'L then this looks like the following grid:

    public static void main(String[] args) {

        String[] grid = {
                "FOOF",
                "OCOO",
                "OOOH",
                "FOOO"
        };

        // 4 x 4 grid

        int rows = 4;
        int cols = 4;

        // count food and find start, home

        int startR = 0;
        int startC = 0;

        int homeR = 0;
        int homeC = 0;

        int foodCount = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                char ch = grid[r].charAt(c);

                if (ch == 'C') {
                    startR = r;
                    startC = c;
                }

                if (ch == 'H') {
                    homeR = r;
                    homeC = c;
                }

                if (ch == 'F') {
                    foodCount++;
                }

            }
        }

        // given food id
        int[][] foodId = new int[rows][cols];
        for (int[] row : foodId) {
            Arrays.fill(row, -1);
        }

        int id = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r].charAt(c) == 'F') {
                    foodId[r][c] = id++;
                }
            }
        }

        // mask all food

        int allFoodMask = (1 << foodCount) - 1;

        // BFS
        Queue<int[]> queue = new LinkedList<>();

        boolean[][][] visited = new boolean[rows][cols][1 << foodCount];

        queue.offer(new int[] {
                startR,
                startC,
                0,
                0
        });

        visited[startR][startC][0] = true;

        int[][] directions = {
                { -1, 0 },
                { 1, 0 },
                { 0, -1 },
                { 0, 1 }
        };

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            int r = current[0];
            int c = current[1];
            int mask = current[2];
            int distance = current[3];

            // reach home with all food

            if (r == homeR && c == homeC && mask == allFoodMask) {
                System.out.println(distance);
                return;
            }

            // try 4 directions

            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr < 0 || nr >= rows || nc < 0 || nc >= cols) {
                    continue;
                }

                if (grid[nr].charAt(nc) == 'H' && mask != allFoodMask) {
                    continue;
                }

                // update food mask
                int newMask = mask;
                if (grid[nr].charAt(nc) == 'F') {
                    int food = foodId[nr][nc];
                    newMask = mask | (1 << food);
                }

                // avoid repeated states
                if (visited[nr][nc][newMask]) {
                    continue;
                }

                visited[nr][nc][newMask] = true;

                queue.offer(new int[] {
                        nr, nc, newMask, distance + 1
                });
            }
        }
        System.out.println(-1);
    }
}
