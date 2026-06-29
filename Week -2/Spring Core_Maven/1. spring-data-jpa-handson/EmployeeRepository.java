package com.cognizant.spring_data_jpa_quick_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.spring_data_jpa_quick_example.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}