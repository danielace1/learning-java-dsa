package com.example.problems.set1;

public class TwoDArray {
    public static void main(String[] args) {
        String s = "WELCOMETOZOHOCORPORATION";
        String searchWord = "TOO";

        int r = 5;
        int c = 5;

        char[][] arr = new char[r][c];

        int idx = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (idx < s.length()) {
                    arr[i][j] = s.charAt(idx++);
                } else {
                    arr[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        search(arr, searchWord);
    }

    private static void search(char[][] arr, String word) {
        int r = arr.length;
        int c = arr[0].length;

        int len = word.length();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == word.charAt(0)) {

                    // horizontal search
                    if (j + len <= c) {
                        int k;
                        for (k = 0; k < len; k++) {
                            if (arr[i][j + k] != word.charAt(k)) {
                                break;
                            }
                        }

                        if (k == len) {
                            System.out.println("Found horizontally: ");
                            System.out.println("Start Index:" + i + " " + j);
                            System.out.println("End Index:" + i + " " + (j + len - 1));
                            return;
                        }
                    }

                    if (i + len <= r) {
                        int k;
                        for (k = 0; k < len; k++) {
                            if (arr[i + k][j] != word.charAt(k)) {
                                break;
                            }
                        }

                        if (k == len) {
                            System.out.println("Found vertically: ");
                            System.out.println("Start Index:" + i + " " + j);
                            System.out.println("End Index:" + (i + len - 1) + " " + j);
                            return;
                        }
                    }

                }
            }
        }
        System.out.println("Word not found");
    }
}
