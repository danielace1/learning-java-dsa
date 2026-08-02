package com.example.SystemDesignLearning.cabbookingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.SystemDesignLearning.cabbookingsystem.enums.CarType;
import com.example.SystemDesignLearning.cabbookingsystem.models.Booking;
import com.example.SystemDesignLearning.cabbookingsystem.models.Cab;
import com.example.SystemDesignLearning.cabbookingsystem.models.Employee;

public class BookingSystem {

    private static final String FROM_TO = "OFFICE";

    private List<Employee> employees = new ArrayList<>();
    private List<Cab> cabs = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    private int bookingCounter = 1;

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addCab(Cab cab) {
        cabs.add(cab);
    }

    public void bookCab(Employee employee, String pickUp, String drop) {
        if (!pickUp.equalsIgnoreCase(FROM_TO) && !drop.equalsIgnoreCase(FROM_TO)) {
            System.out.println("Invalid trip. PickUp or Drop must be OFFICE.");
            return;
        }

        List<CarType> allowedTypes = getAllowedCabTypes(employee);

        Cab availableCab = findAvailale(allowedTypes);

        if (availableCab == null) {
            System.out.println("No Cab available.");
            return;
        }

        availableCab.setStatus(false);

        Booking booking = new Booking(bookingCounter++, employee, availableCab, pickUp, drop);

        bookings.add(booking);

        System.out.println("Cab booked successfully!");
        System.out.println("Cab number: " + availableCab.getCabNum());
        System.out.println("Cab Type: " + availableCab.getCarType());

    }

    private List<CarType> getAllowedCabTypes(Employee employee) {
        List<CarType> allowedTypes = new ArrayList<>();

        switch (employee.getLevel()) {
            case PROJECT_MANAGER:
                allowedTypes.add(CarType.XUV);
                allowedTypes.add(CarType.ERTIGA);
                allowedTypes.add(CarType.SWIFT);
                break;

            case TEAM_LEAD:
                allowedTypes.add(CarType.ERTIGA);
                allowedTypes.add(CarType.SWIFT);
                break;
            case SDE:
                allowedTypes.add(CarType.SWIFT);
                break;
        }

        return allowedTypes;
    }

    private Cab findAvailale(List<CarType> allowedTypes) {
        for (CarType type : allowedTypes) {
            for (Cab cab : cabs) {
                if (cab.getCarType() == type && cab.getStatus()) {
                    return cab;
                }
            }
        }

        return null;
    }

    private void completeTrip(int bookingId) {
        for (Booking booking : bookings) {
            if (booking.getBookingId() == bookingId) {
                booking.getCab().setStatus(true);

                System.out.println("Trip completed.");
                System.out.println("Cab " + booking.getCab().getCabNum() + " is now available.");
                return;
            }
        }

        System.out.println("Booking not found");
    }

    public void generateReport() {
        Map<String, Integer> report = new HashMap<>();

        for (Booking booking : bookings) {
            String key = booking.getEmployee().getLevel() + "-" + booking.getCab().getCarType();

            report.put(key, report.getOrDefault(key, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
