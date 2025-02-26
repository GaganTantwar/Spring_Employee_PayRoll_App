package com.bridgelabz.employeepayrollapp.model;


public class EmployeePayRollData {
    private int employeeID;
    private String name;
    private long salary;
    public EmployeePayRollData(){}
    public EmployeePayRollData(int employeeID,Employee employee){
        this.employeeID=employeeID;
        this.name=employee.name;
        this.salary=employee.salary;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public void setEmployeeID(int employeeID){
        this.employeeID=employeeID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public long getSalary(){
        return salary;
    }
    public void setSalary(long salary){
        this.salary=salary;
    }
}
