package com.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT DISTINCT e FROM Employee e left join fetch e.department left join fetch e.skillList WHERE e.permanent = true")
	List<Employee> getAllPermanentEmployees();

}