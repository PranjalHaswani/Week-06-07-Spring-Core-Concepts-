package com.example.SpringCoreConcepts;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String departmentName = "CS";

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}