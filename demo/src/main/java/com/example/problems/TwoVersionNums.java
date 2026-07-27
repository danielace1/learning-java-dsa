package com.example.problems;

public class TwoVersionNums {
    public static void main(String[] args) {
        String version1 = "4.8.2";
        String version2 = "4.9";

        System.out.println(versions(version1, version2));

    }

    private static int versions(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int n = Math.max(v1.length, v2.length);

        for (int i = 0; i < n; i++) {
            int n1 = (i < v1.length) ? Integer.parseInt(v1[i]) : 0;
            int n2 = (i < v2.length) ? Integer.parseInt(v2[i]) : 0;

            if (n1 > n2) {
                System.out.println("v1 is greater" + n1);
                return 1;
            }

            if (n1 < n2) {
                System.out.println("v2 is greater " + n2);
                System.out.println("upgraded");
                return -1;
            }

        }

        return 0;
    }
}
