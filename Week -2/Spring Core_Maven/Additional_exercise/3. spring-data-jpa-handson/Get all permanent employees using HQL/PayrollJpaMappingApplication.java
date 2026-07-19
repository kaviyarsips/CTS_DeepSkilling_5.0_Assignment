package com.cognizant;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.model.Employee;
import com.cognizant.service.EmployeeService;

@SpringBootApplication
public class PayrollJpaMappingApplication implements CommandLineRunner {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(PayrollJpaMappingApplication.class);

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(PayrollJpaMappingApplication.class, args);
    }

    @Override
    public void run(String... args) {

        testGetAllPermanentEmployees();

    }

    private void testGetAllPermanentEmployees() {

        LOGGER.info("Start");

        List<Employee> employees = employeeService.getAllPermanentEmployees();

        LOGGER.debug("Permanent Employees : {}", employees);

        employees.forEach(e -> LOGGER.debug("Skills : {}", e.getSkillList()));

        LOGGER.info("End");
    }
}