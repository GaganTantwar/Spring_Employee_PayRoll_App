package com.bridgelabz.employeepayrollapp.model;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.*;
import com.bridgelabz.employeepayrollapp.model.Employee;
@Entity
@Table(name="employee_payroll")
public @Data class EmployeePayRollData {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int employeeID;
    @Column(name="name")
    private String name;
    private long salary;
    private  String gender;
    private  LocalDate startDate;
    private String note;
    private String profilePic;
    @ElementCollection
    @CollectionTable(name="employee_department",joinColumns = @JoinColumn(name="id"))
    @Column(name="department")
    private List<String>departments;
    public EmployeePayRollData() {}

    public EmployeePayRollData(Employee emp){this.updateEmployeePayRollData(emp);}

    public void updateEmployeePayRollData(Employee employee){
        this.name=employee.name;
        this.salary=employee.salary;
        this.gender=employee.gender;
        this.note=employee.note;
        this.startDate=employee.startDate;
        this.profilePic=employee.profilePic;
        this.departments=employee.department;
    }
}
