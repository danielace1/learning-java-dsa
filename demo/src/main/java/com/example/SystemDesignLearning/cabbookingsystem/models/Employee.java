package com.example.SystemDesignLearning.cabbookingsystem.models;

import com.example.SystemDesignLearning.cabbookingsystem.enums.EmployeeLevel;

public class Employee {
    private int employeeId;
    private String name;
    private EmployeeLevel level;

    public Employee(int employeeId, String name, EmployeeLevel level) {
        this.employeeId = employeeId;
        this.name = name;
        this.level = level;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public EmployeeLevel getLevel() {
        return level;
    }

}
