package com.cognizant.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Repository;

import com.cognizant.model.Department;
import com.cognizant.model.Employee;
import com.cognizant.model.Skill;

@Repository
public class EmployeeDao {

    private static ArrayList<Employee> EMPLOYEE_LIST;

    public EmployeeDao() {

        try {

            // Departments
            Department dept1 = new Department(1, "IT");
            Department dept2 = new Department(2, "HR");
            Department dept3 = new Department(3, "Finance");

            // Skills
            Skill skill1 = new Skill(1, "Java");
            Skill skill2 = new Skill(2, "Spring");
            Skill skill3 = new Skill(3, "Angular");

            // Employee List
            EMPLOYEE_LIST = new ArrayList<>();

            EMPLOYEE_LIST.add(new Employee(
                    101,
                    "John",
                    50000,
                    true,
                    dept1,
                    Arrays.asList(skill1, skill2),
                    new SimpleDateFormat("dd/MM/yyyy").parse("15/08/1998")
            ));

            EMPLOYEE_LIST.add(new Employee(
                    102,
                    "Priya",
                    60000,
                    true,
                    dept2,
                    Arrays.asList(skill2, skill3),
                    new SimpleDateFormat("dd/MM/yyyy").parse("20/04/1997")
            ));

            EMPLOYEE_LIST.add(new Employee(
                    103,
                    "Rahul",
                    45000,
                    false,
                    dept3,
                    Arrays.asList(skill1),
                    new SimpleDateFormat("dd/MM/yyyy").parse("11/12/1999")
            ));

            EMPLOYEE_LIST.add(new Employee(
                    104,
                    "Anjali",
                    70000,
                    true,
                    dept1,
                    Arrays.asList(skill1, skill3),
                    new SimpleDateFormat("dd/MM/yyyy").parse("10/06/1996")
            ));

            EMPLOYEE_LIST.add(new Employee(
                    105,
                    "Karan",
                    55000,
                    true,
                    dept2,
                    Arrays.asList(skill2),
                    new SimpleDateFormat("dd/MM/yyyy").parse("25/09/1998")
            ));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}