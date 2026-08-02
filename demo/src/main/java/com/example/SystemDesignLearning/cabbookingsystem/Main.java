package com.example.SystemDesignLearning.cabbookingsystem;

import com.example.SystemDesignLearning.cabbookingsystem.enums.CarType;
import com.example.SystemDesignLearning.cabbookingsystem.enums.EmployeeLevel;
import com.example.SystemDesignLearning.cabbookingsystem.models.Cab;
import com.example.SystemDesignLearning.cabbookingsystem.models.Employee;

public class Main {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();

        // Employee pm = new Employee(1, "John", EmployeeLevel.PROJECT_MANAGER);
        // Employee teamLead = new Employee(2, "Alice", EmployeeLevel.TEAM_LEAD);
        // Employee sde = new Employee(3, "David", EmployeeLevel.SDE);

        // bookingSystem.addEmployee(pm);
        // bookingSystem.addEmployee(teamLead);
        // bookingSystem.addEmployee(sde);

        // Cab xuv = new Cab(1, "101", CarType.XUV);
        // Cab ertiga = new Cab(2, "102", CarType.ERTIGA);
        // Cab swift = new Cab(3, "103", CarType.SWIFT);

        // bookingSystem.addCab(xuv);
        // bookingSystem.addCab(ertiga);
        // bookingSystem.addCab(swift);

        // bookingSystem.bookCab(pm, "OFFICE", "Airport");
        // bookingSystem.bookCab(teamLead, "Railway Station", "OFFICE");
        // bookingSystem.bookCab(sde, "OFFICE", "Client location");

        // bookingSystem.generateReport();

        testing();

    }

    private static void testing() {

        BookingSystem bookingSystem = new BookingSystem();

        // Employees
        Employee pm1 = new Employee(
                1,
                "John",
                EmployeeLevel.PROJECT_MANAGER);

        Employee pm2 = new Employee(
                2,
                "Robert",
                EmployeeLevel.PROJECT_MANAGER);

        bookingSystem.addEmployee(pm1);
        bookingSystem.addEmployee(pm2);

        // Cabs
        Cab xuv = new Cab(
                1,
                "101",
                CarType.XUV);

        Cab ertiga = new Cab(
                2,
                "102",
                CarType.ERTIGA);

        Cab swift = new Cab(
                3,
                "103",
                CarType.SWIFT);

        bookingSystem.addCab(xuv);
        bookingSystem.addCab(ertiga);
        bookingSystem.addCab(swift);

        // PM1 books first
        bookingSystem.bookCab(
                pm1,
                "OFFICE",
                "Airport");

        // PM2 books while XUV is unavailable
        bookingSystem.bookCab(
                pm2,
                "OFFICE",
                "Railway Station");

        bookingSystem.generateReport();
    }
}
