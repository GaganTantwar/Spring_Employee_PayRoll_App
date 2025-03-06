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
        return employeePayRollRepository.findAll();
    }
    public EmployeePayRollData getEmployeePayRollDataById(int empId){
        return employeePayRollRepository.findById(empId).orElseThrow(() -> new EmployeePayRollException("Employee With empId"+empId+"does not exists"));
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
       empData.updateEmployeePayRollData(emp);
       return employeePayRollRepository.save(empData);
    }
    public void deleteEmployeePayRollData(int empId){
        EmployeePayRollData empData=this.getEmployeePayRollDataById(empId);
        employeePayRollRepository.delete(empData);
    }

}
