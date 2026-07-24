package com.example.OOP.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student sudharsan = new Student(12, 82.91f);
        Student daniel = new Student(13, 92.92f);
        Student sankar = new Student(14, 93.92f);
        Student manuel = new Student(15, 91.92f);

        Student[] list = { sudharsan, daniel, sankar, manuel };

        System.out.println(Arrays.toString(list));
        // Arrays.sort(list, new Comparator<Student>() {
        // @Override
        // public int compare(Student o1, Student o2) {
        // return (int) (o1.marks - o2.marks);
        // };
        // });

        Arrays.sort(list, (o1, o2) -> -(int) (o1.marks - o2.marks)); // lambda expression

        if (sudharsan.compareTo(daniel) < 0) {
            System.out.println(sudharsan.compareTo(daniel));
            System.out.println("daniel has more marks");
        }

    }
}
