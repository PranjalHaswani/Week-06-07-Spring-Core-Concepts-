package com.example.SpringCoreConcepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String name = "Pranjal Haswani";
    private final DepartmentBean department;

    @Autowired
    public EmployeeBean(DepartmentBean department) {
        this.department = department;
    }

    public String getEmployeeDetails() {
        return "Employee Name: " + name + ", Department: " + department.getDepartmentName();
    }
}