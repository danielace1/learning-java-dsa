package com.example.problems.set1;

public class GrandChildCount {
    public static void main(String[] args) {
        String[][] family = {
                { "luke", "shaw" },
                { "wayne", "rooney" },
                { "rooney", "ronaldo" },
                { "shaw", "rooney" }
        };

        String person = "ronaldo";
        int count = 0;

        for (int i = 0; i < family.length; i++) {
            if (family[i][1].equals(person)) {
                String child = family[i][0];

                // count grand child
                for (int j = 0; j < family.length; j++) {
                    if (family[j][1].equals(child)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
