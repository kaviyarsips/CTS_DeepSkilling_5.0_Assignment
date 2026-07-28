package com.cognizant.ormlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static EmployeeService employeeService;
    private static DepartmentService departmentService;
    private static SkillService skillService;

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        employeeService = context.getBean(EmployeeService.class);
        departmentService = context.getBean(DepartmentService.class);
        skillService = context.getBean(SkillService.class);

        // Uncomment ONLY ONE method at a time

        // testGetAverageSalary();

        testGetAverageSalaryByDepartment();

    }

    /**
     * Get average salary of all employees
     */
    private static void testGetAverageSalary() {

        LOGGER.info("Start");

        double averageSalary = employeeService.getAverageSalary();

        LOGGER.debug("Average Salary : {}", averageSalary);

        LOGGER.info("End");
    }

    /**
     * Get average salary of a particular department
     */
    private static void testGetAverageSalaryByDepartment() {

        LOGGER.info("Start");

        int departmentId = 1;

        double averageSalary = employeeService.getAverageSalary(departmentId);

        LOGGER.debug("Average Salary of Department {} : {}", departmentId, averageSalary);

        LOGGER.info("End");
    }

}