package com.example.problems.set4;

public class RemPetrolSimulation {
    public static void main(String[] args) {
        int petrol = 2; // petrol in car (Litres)
        int[] distance = { 1, 5, 3 }; // Petrol Bunks: A->B->C
        int[] capacity = { 6, 4, 2 }; // petrol bunks capacities

        // op: rem 5L petrol in car

        for (int i = 0; i < distance.length; i++) {

            if (petrol < distance[i]) {
                System.out.println("Cannot reach");
                return;
            }

            petrol -= distance[i];
            petrol += capacity[i];
        }

        System.out.println("Remaining petrol in car: " + petrol + " litres.");

    }
}
