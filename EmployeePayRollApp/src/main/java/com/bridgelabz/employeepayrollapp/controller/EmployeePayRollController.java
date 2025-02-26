package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayRollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bridgelabz.employeepayrollapp.model.Employee;
@RestController
@RequestMapping("/employee")
public class EmployeePayRollController {
    @RequestMapping(value={"","/","/get"})
    public ResponseEntity<ResponseDTO> getEmployeeData(){
        EmployeePayRollData empData=null;
         empData=new EmployeePayRollData(1,new Employee("Pankaj",30000));
         ResponseDTO responseDTO=new ResponseDTO("Get Call Successful",empData);
         return  new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeeData(@PathVariable ("empId") int empId){
        EmployeePayRollData empData=null;
        empData=new EmployeePayRollData(empId,new Employee("Kishore",35000));
        ResponseDTO responseDTO=new ResponseDTO("Get Call Successful",empData);
        return  new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeeData(@RequestBody Employee emp){
        EmployeePayRollData empData=null;
        empData=new EmployeePayRollData(3,emp);
        ResponseDTO responseDTO=new ResponseDTO("Created Employee Payroll Data Successful",empData);
        return  new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);

    }
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployee(@RequestBody Employee emp){
        EmployeePayRollData empData=null;
        empData=new EmployeePayRollData(3,emp);
        ResponseDTO responseDTO=new ResponseDTO("Created Employee Payroll Data Successful",empData);
        return  new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);

    }
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployee(@PathVariable("empId") int empId){
        ResponseDTO responseDTO=new ResponseDTO("Deleted Successfully","Deleted Id:" +empId);
        return  new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);

    }

}
