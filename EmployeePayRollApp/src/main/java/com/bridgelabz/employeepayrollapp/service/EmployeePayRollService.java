package com.bridgelabz.employeepayrollapp.service;
import com.bridgelabz.employeepayrollapp.exceptions.EmployeePayRollException;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayRollRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bridgelabz.employeepayrollapp.model.*;
import com.bridgelabz.employeepayrollapp.dto.*;
import com.bridgelabz.employeepayrollapp.controller.*;
import java.util.*;
@Service
@Slf4j
public class EmployeePayRollService implements InterfaceEmployeePayRollService{
    @Autowired
     private EmployeePayRollRepository employeePayRollRepository;

    List<EmployeePayRollData> employeeList=new ArrayList<>();
    public List<EmployeePayRollData> getEmployeePayRollData(){
        return employeeList;
    }
    public EmployeePayRollData getEmployeePayRollDataById(int empId){

        return employeeList.stream().filter(empData->empData.getEmployeeID()==empId).findFirst().orElseThrow(()->new EmployeePayRollException("Employee Not Found"));

    }
    public EmployeePayRollData createEmployeePayRollData(Employee emp){
        EmployeePayRollData empData=null;
        empData=new EmployeePayRollData(emp);
        log.debug("Emp Data: "+emp.toString());
        employeeList.add(empData);
        return employeePayRollRepository.save(empData);
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
