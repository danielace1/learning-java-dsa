package com.example.problems.set5;

public class FindFrnds {
    public static void main(String[] args) {
        // Help john find frnds:
        // 3
        // Mani 3 ram raj guna
        // Ram 2 kumar Kishore
        // Mughil 3 praveen Naveen Ramesh
        // op: Raj guna kumar Kishore praveen Naveen Ramesh

        String[][] data = {
                { "Mani", "3", "ram", "raj", "guna" },
                { "Ram", "2", "kumar", "Kishore" },
                { "Mughil", "3", "praveen", "Naveen", "Ramesh" }
        };

        int n = data.length;

        for (int i = 0; i < n; i++) {
            String person = data[i][0];
            int friends = Integer.parseInt(data[i][1]);

            for (int j = 0; j < friends; j++) {
                String friend = data[i][j + 2];

                if (i == 0 && j == 0) {
                    // skip, existing frnd
                    continue;
                }

                System.out.print(friend + " ");
            }
        }

    }
}
