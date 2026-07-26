package com.example.SystemDesignLearning.labBookingSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.SystemDesignLearning.labBookingSystem.models.Student;
import com.example.SystemDesignLearning.labBookingSystem.models.AllocatedDay;
import com.example.SystemDesignLearning.labBookingSystem.models.BookingRequest;
import com.example.SystemDesignLearning.labBookingSystem.models.Lab;
import com.example.SystemDesignLearning.labBookingSystem.models.RequestedDay;

public class LabBookingService {
    private List<Student> students = new ArrayList<>();
    private List<Lab> labs = new ArrayList<>();

    private List<BookingRequest> requests = new ArrayList<>();
    private List<RequestedDay> requestedDays = new ArrayList<>();
    private List<AllocatedDay> allocatedDays = new ArrayList<>();

    private int requestCounter = 1;
    private int requestedDayCounter = 1;
    private int allocatedDayCounter = 1;

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addLab(Lab lab) {
        labs.add(lab);
    }

    public BookingRequest requestLab(Student student, Lab lab, List<LocalDate> dates) {
        BookingRequest request = new BookingRequest(requestCounter++, student, lab);
        requests.add(request);

        for (LocalDate date : dates) {
            RequestedDay day = new RequestedDay(requestedDayCounter++, request, date);
            requestedDays.add(day);
        }

        return request;
    }

    public void allocateLab(BookingRequest bookingRequest, List<LocalDate> dates) {
        for (LocalDate date : dates) {
            AllocatedDay allocated = new AllocatedDay(allocatedDayCounter++, bookingRequest, date);
            allocatedDays.add(allocated);
        }
    }

    // Which student requested which lab?
    // Number of days requested
    public void viewRequestReport() {
        System.out.println(" ----- Request Report -----");

        for (BookingRequest request : requests) {
            int count = 0;

            for (RequestedDay day : requestedDays) {
                if (day.getBookingRequest().getRequestId() == request.getRequestId()) {
                    count++;
                }
            }

            System.out.println("Student: " + request.getStudent().getStudentName());
            System.out.println("Lab: " + request.getLab().getLabName());
            System.out.println("Requested Days: " + count);
            System.out.println();
        }
    }

    // Allocated lab details
    public void viewAllocatedReport() {

        System.out.println(" ----- Allocated Report -----");

        for (AllocatedDay day : allocatedDays) {
            BookingRequest request = day.getBookingRequest();

            System.out.println("Student: " + request.getStudent().getStudentName());
            System.out.println("Lab: " + request.getLab().getLabName());
            System.out.println("Allocated Date: " + day.getAllocatedDate());

            System.out.println();
        }

    }

    // Charges
    public void viewChargesReport() {

        System.out.println(" ----- Charges Report -----");

        for (BookingRequest request : requests) {
            int allocatedCount = 0;

            for (AllocatedDay day : allocatedDays) {
                if (day.getBookingRequest().getRequestId() == request.getRequestId()) {
                    allocatedCount++;
                }
            }
            double chargePerDay = request.getLab().getPerDayCharge();
            double totalCharge = allocatedCount * chargePerDay;

            System.out.println("Student: " + request.getStudent().getStudentName());
            System.out.println("Lab: " + request.getLab().getLabName());
            System.out.println("Allocated Days: " + allocatedCount);
            System.out.println("Charge Per Day: " + chargePerDay);
            System.out.println("Total Charge: " + totalCharge);
            System.out.println();

        }

    }

}
