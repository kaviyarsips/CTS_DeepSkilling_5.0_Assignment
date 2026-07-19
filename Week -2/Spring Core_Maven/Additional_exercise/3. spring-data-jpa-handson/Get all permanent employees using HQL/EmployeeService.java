package com.cognizant.service;

import java.util.List;

import com.cognizant.model.Employee;

public interface EmployeeService {

    Employee get(int id);

    Employee save(Employee employee);

    List<Employee> getAllPermanentEmployees();

}