package com.bridgelabz.employeepayrollapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.ToString;
import java.time.LocalDate;
import java.util.*;
public @ToString class Employee {
    @NotEmpty(message = "Name Should not be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee Name Should be Valid")
    public String name;
    @Min(value=25000,message = "Minimum Value Should be 25000")
    public long salary;
    @Pattern(regexp = "male|female",message = "Gender needs to be male or female")
    public String gender;
    @JsonFormat(pattern = "dd MM yyyy")
    @NotNull(message = "Start Date Should not be Empty")
    @PastOrPresent(message = "Start Date Should be past or today's date")
    public LocalDate startDate;
    @NotBlank(message ="Note cannot be Empty")
    public String note;
    @NotBlank(message = "Profile Pic Cannot be Empty")
    public String profilePic;
    @NotNull(message = "Department Should Not be Empty")
    public List<String> department;

}
