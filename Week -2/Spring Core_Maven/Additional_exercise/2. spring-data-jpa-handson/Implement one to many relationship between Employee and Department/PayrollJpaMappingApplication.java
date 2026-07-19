package com.cognizant;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.model.Employee;
import com.cognizant.repository.EmployeeRepository;

@SpringBootApplication
public class PayrollJpaMappingApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(PayrollJpaMappingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Searching Employee...");

        Optional<Employee> employee = employeeRepository.findById(1);

        if (employee.isPresent()) {

            Employee emp = employee.get();

            System.out.println("Employee Found");
            System.out.println("ID : " + emp.getId());
            System.out.println("Name : " + emp.getName());
            System.out.println("Salary : " + emp.getSalary());
            System.out.println("Permanent : " + emp.isPermanent());
            System.out.println("DOB : " + emp.getDateOfBirth());

            if (emp.getDepartment() != null) {
                System.out.println("Department : " + emp.getDepartment().getName());
            } else {
                System.out.println("Department not assigned.");
            }

        } else {

            System.out.println("Employee with ID 1 not found.");

        }
    }
}