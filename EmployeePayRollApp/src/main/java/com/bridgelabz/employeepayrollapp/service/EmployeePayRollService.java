package com.bridgelabz.employeepayrollapp.service;
import org.springframework.stereotype.Service;
import com.bridgelabz.employeepayrollapp.model.*;
import com.bridgelabz.employeepayrollapp.dto.*;
import com.bridgelabz.employeepayrollapp.controller.*;
import java.util.*;
@Service
public class EmployeePayRollService implements InterfaceEmployeePayRollService{
    public List<EmployeePayRollData> getEmployeePayRollData(){
        List<EmployeePayRollData> empDataList=new ArrayList<>();
        empDataList.add(new EmployeePayRollData(1,new Employee("Pankaj",30000)));
        return empDataList;
    }
    public EmployeePayRollData getEmployeePayRollDataById(int empId){
        EmployeePayRollData empData=null;
        empData=new EmployeePayRollData(2,new Employee("Kishore",35000));
        return empData;

    }
    public EmployeePayRollData createEmployeePayRollData(Employee emp){
        EmployeePayRollData empData=null;
        empData=new EmployeePayRollData(3,emp);
        return empData;
    }
    public EmployeePayRollData updateEmployeePayRollData(Employee emp){
        EmployeePayRollData empData=null;
        empData=new EmployeePayRollData(1,emp);
        return empData;
    }
    public void deleteEmployeePayRollData(int empId){

    }

}
