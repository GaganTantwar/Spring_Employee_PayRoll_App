package com.bridgelabz.employeepayrollapp.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.ToString;
import java.util.*;
public @ToString class Employee {
    @NotEmpty(message = "Name Should not be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee Name Should be Valid")
    public String name;
    @Min(value=25000,message = "Minimum Value Should be 25000")
    public long salary;
    public String gender;
    public String startDate;
    public String note;
    public String profilePic;
    public List<String> department;
    

}
