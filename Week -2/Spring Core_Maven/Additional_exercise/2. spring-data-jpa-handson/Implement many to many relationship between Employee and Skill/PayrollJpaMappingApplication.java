package com.cognizant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.model.Employee;
import com.cognizant.model.Skill;
import com.cognizant.service.EmployeeService;
import com.cognizant.service.SkillService;

@SpringBootApplication
public class PayrollJpaMappingApplication implements CommandLineRunner {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    SkillService skillService;

    public static void main(String[] args) {
        SpringApplication.run(PayrollJpaMappingApplication.class, args);
    }

    @Override
    public void run(String... args) {

        testAddSkillToEmployee();

    }

    private void testAddSkillToEmployee() {

        Employee employee = employeeService.get(1);

        Skill skill = skillService.get(2);

        if (employee == null) {
            System.out.println("Employee not found");
            return;
        }

        if (skill == null) {
            System.out.println("Skill not found");
            return;
        }

        employee.getSkillList().add(skill);

        employeeService.save(employee);

        System.out.println("Skill added successfully.");

    }

}