package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayRollData;
import com.bridgelabz.employeepayrollapp.service.InterfaceEmployeePayRollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bridgelabz.employeepayrollapp.model.Employee;
import java.util.*;
@RestController
@RequestMapping("/employee")
public class EmployeePayRollController {
    @Autowired
    private InterfaceEmployeePayRollService employeePayRollService;
    @RequestMapping(value={"","/","/get"})
    public ResponseEntity<ResponseDTO> getEmployeeData(){
         List<EmployeePayRollData> empDataList=null;
         empDataList=employeePayRollService.getEmployeePayRollData();
         ResponseDTO responseDTO=new ResponseDTO("Get Call Successful",empDataList);
         return  new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeeData(@PathVariable ("empId") int empId){
        EmployeePayRollData empData=null;
         empData=employeePayRollService.getEmployeePayRollDataById(empId);
         ResponseDTO responseDTO=new ResponseDTO("Get Call Successful",empData);
        return  new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeeData(@RequestBody Employee emp){
        EmployeePayRollData empData=null;
        empData=employeePayRollService.createEmployeePayRollData(emp);
        ResponseDTO responseDTO=new ResponseDTO("Created Employee Payroll Data Successful",empData);
        return  new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);

    }
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployee(@RequestBody Employee emp){
        EmployeePayRollData empData=null;
        empData=employeePayRollService.updateEmployeePayRollData(emp);
        ResponseDTO responseDTO=new ResponseDTO("Updated Employee Payroll Data Successful",empData);
        return  new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);

    }
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployee(@PathVariable("empId") int empId){
        employeePayRollService.deleteEmployeePayRollData(empId);
        ResponseDTO responseDTO=new ResponseDTO("Deleted Successfully","Deleted Id:" +empId);
        return  new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);

    }

}
