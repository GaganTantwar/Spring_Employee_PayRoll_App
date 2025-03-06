package com.bridgelabz.employeepayrollapp.repository;

import com.bridgelabz.employeepayrollapp.model.EmployeePayRollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.*;
public interface EmployeePayRollRepository extends JpaRepository<EmployeePayRollData, Integer> {
    @Query(value = "select * from employee_payroll,employee_department where employeeid=id and department =:department", nativeQuery = true)
    List<EmployeePayRollData> findEmployeeByDepartment(String department);
}

