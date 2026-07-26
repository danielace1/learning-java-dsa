package com.example.SystemDesignLearning.labBookingSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.SystemDesignLearning.labBookingSystem.models.BookingRequest;
import com.example.SystemDesignLearning.labBookingSystem.models.Lab;
import com.example.SystemDesignLearning.labBookingSystem.models.Student;

public class Main {
    public static void main(String[] args) {
        LabBookingService service = new LabBookingService();

        Student s1 = new Student(1, "John");
        Student s2 = new Student(2, "Alice");

        service.addStudent(s1);
        service.addStudent(s2);

        Lab l1 = new Lab(1, "AI Lab", 500);
        Lab l2 = new Lab(2, "Networking Lab", 700);

        service.addLab(l1);
        service.addLab(l2);

        List<LocalDate> requestedDates = new ArrayList<>();

        requestedDates.add(LocalDate.of(2026, 7, 21));
        requestedDates.add(LocalDate.of(2026, 7, 23));
        requestedDates.add(LocalDate.of(2026, 7, 25));

        BookingRequest request = service.requestLab(s1, l1, requestedDates);

        service.allocateLab(request, requestedDates);

        service.viewRequestReport();
        service.viewAllocatedReport();
        service.viewChargesReport();

    }
}
