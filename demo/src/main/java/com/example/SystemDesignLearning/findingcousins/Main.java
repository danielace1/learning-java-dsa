package com.example.SystemDesignLearning.findingcousins;

import java.util.List;
import java.util.Scanner;

import com.example.SystemDesignLearning.findingcousins.models.Person;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();

        // Grandparents
        tree.addPerson(new Person(1, "GrandFather", "Male", 0, 0));
        tree.addPerson(new Person(2, "GrandMother", "Female", 0, 0));

        // Father's generation - siblings
        tree.addPerson(new Person(3, "Sivakumar", "Male", 1, 2));
        tree.addPerson(new Person(4, "JothikaMother", "Female", 1, 2));

        // other parents
        tree.addPerson(new Person(5, "SuriyaMother", "Female", 0, 0)); // wife of sivakumar
        tree.addPerson(new Person(6, "JothikaFather", "Male", 0, 0)); // husband of JothikaMother

        // children
        tree.addPerson(new Person(7, "Suriya", "Male", 3, 5));
        tree.addPerson(new Person(8, "Karthick", "Male", 3, 5));

        tree.addPerson(new Person(9, "Jothika", "Female", 6, 4));
        tree.addPerson(new Person(10, "Nagma", "Female", 6, 4));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter person name: ");
        String name = sc.nextLine();

        List<Person> cousins = tree.findCousins(name);

        if (cousins.isEmpty()) {
            System.out.println("No cousins found");
        } else {
            System.out.println("Cousins of " + name + ":");

            for (Person person : cousins) {
                System.out.println(person.getName());
            }
        }

        sc.close();

    }
}
