package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.model.Employee;
import com.cognizant.service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Display Employee List
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Display Employee by Id (Edit Form)
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {

        List<Employee> employees = employeeService.getAllEmployees();

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }

        return null;
    }

}