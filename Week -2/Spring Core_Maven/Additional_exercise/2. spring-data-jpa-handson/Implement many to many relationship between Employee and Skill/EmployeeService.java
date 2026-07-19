package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Employee;
import com.cognizant.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public Employee get(int id) {

        return repository.findById(id).orElse(null);

    }

    public void save(Employee employee) {

        repository.save(employee);

    }

}