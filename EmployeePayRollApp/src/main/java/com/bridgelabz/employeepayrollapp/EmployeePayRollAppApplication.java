package com.bridgelabz.employeepayrollapp;

import com.bridgelabz.employeepayrollapp.model.EmployeePayRollData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
@Slf4j
public class
EmployeePayRollAppApplication {
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(EmployeePayRollAppApplication.class,args);
		log.info("Employee Payroll App Started {} in Environment",context.getEnvironment().getProperty("environment"));
		log.info("Employee Payroll App DB user is {}",context.getEnvironment().getProperty("spring.datasource.username"));
	}

}
