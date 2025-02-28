package com.bridgelabz.employeepayrollapp.model;


import lombok.Data;
import java.time.LocalDate;
import java.util.*;
import com.bridgelabz.employeepayrollapp.model.Employee;
public @Data class EmployeePayRollData {
    private int employeeID;
    private String name;
    private long salary;
    private  String gender;
    private  LocalDate startDate;
    private String note;
    private String profilePic;
    private List<String>departments;
    public EmployeePayRollData(){}
    public EmployeePayRollData(int employeeID,Employee employee){
        this.employeeID=employeeID;
        this.name=employee.name;
        this.salary=employee.salary;
        this.gender=employee.gender;
        this.note=employee.note;
        this.startDate=employee.startDate;
        this.profilePic=employee.profilePic;
        this.departments=employee.department;
    }
}
