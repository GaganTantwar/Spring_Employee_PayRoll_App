package com.bridgelabz.employeepayrollapp.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class Employee {
    @NotEmpty(message = "Name Should not be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee Name Should be Valid")
    public String name;
    @Min(value=25000,message = "Minimum Value Should be 25000")
    public long salary;

    public Employee(String name,long salary){
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "Employee Name: " + name + ", Salary: " + String.format("%.2f", salary);
    }
}
