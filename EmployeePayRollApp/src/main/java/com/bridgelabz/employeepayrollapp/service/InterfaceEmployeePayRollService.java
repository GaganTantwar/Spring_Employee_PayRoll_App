package com.bridgelabz.employeepayrollapp.service;
import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.model.EmployeePayRollData;

import java.util.*;
public interface InterfaceEmployeePayRollService {
    List<EmployeePayRollData> getEmployeePayRollData();
    EmployeePayRollData getEmployeePayRollDataById(int empId);
    EmployeePayRollData createEmployeePayRollData(Employee emp);
    EmployeePayRollData updateEmployeePayRollData(int empId,Employee emp);
    void deleteEmployeePayRollData(int empId);

}
