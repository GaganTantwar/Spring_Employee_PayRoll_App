package com.bridgelabz.employeepayrollapp.service;
import com.bridgelabz.employeepayrollapp.exceptions.EmployeePayRollException;
import org.springframework.stereotype.Service;
import com.bridgelabz.employeepayrollapp.model.*;
import com.bridgelabz.employeepayrollapp.dto.*;
import com.bridgelabz.employeepayrollapp.controller.*;
import java.util.*;
@Service
public class EmployeePayRollService implements InterfaceEmployeePayRollService{
    List<EmployeePayRollData> employeeList=new ArrayList<>();
    public List<EmployeePayRollData> getEmployeePayRollData(){
        return employeeList;
    }
    public EmployeePayRollData getEmployeePayRollDataById(int empId){

        return employeeList.stream().filter(empData->empData.getEmployeeID()==empId).findFirst().orElseThrow(()->new EmployeePayRollException("Employee Not Found"));

    }
    public EmployeePayRollData createEmployeePayRollData(Employee emp){
        EmployeePayRollData empData=null;
        empData=new EmployeePayRollData(employeeList.size()+1,emp);
        employeeList.add(empData);
        return empData;
    }
    public EmployeePayRollData updateEmployeePayRollData(int empId,Employee emp){
       EmployeePayRollData empData=this.getEmployeePayRollDataById(empId);
       empData.setName(emp.name);
       empData.setSalary(emp.salary);
       employeeList.set(empId-1,empData);
       return empData;
    }
    public void deleteEmployeePayRollData(int empId){
        employeeList.remove(empId-1);
    }

}
