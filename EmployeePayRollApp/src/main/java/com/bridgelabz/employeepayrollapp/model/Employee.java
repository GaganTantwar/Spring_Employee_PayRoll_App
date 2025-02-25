package com.bridgelabz.employeepayrollapp.model;

public class Employee {
    public String name;
    public long salary;
    public int empId;
    public Employee(String name,long salary){
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "Employee{id=" + empId + ", name='" + name + "', salary=" + salary + "}";
    }
}
