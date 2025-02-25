package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bridgelabz.employeepayrollapp.model.Employee;
@RestController
@RequestMapping("/employee")
public class EmployeePayRollController {
    @RequestMapping(value={"","/","/get"})
    public ResponseEntity<String> getEmployeeData(){
        return new ResponseEntity<String>("Get Call Success ", HttpStatus.OK);
    }
    @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeeData(@PathVariable ("empId") int empId){
        return new ResponseEntity<String>("Get Call Success for Id: "+empId,HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<String> addEmployeeData(@RequestBody Employee emp){
        return new ResponseEntity<String>("Created Employee Data: "+emp,HttpStatus.OK);

    }
    @PutMapping("/update")
    public ResponseEntity<String> updateEmployee(@RequestBody Employee emp){
        return new ResponseEntity<String>("Update Employee Payroll Data for: "+emp,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("empId") int empId){
        return new ResponseEntity<String>("Delete Call Success for Id :"+empId,HttpStatus.OK);
    }

}
