package com.cognizant.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Employee;

@Repository
public class EmployeeDao {

    private static ArrayList<Employee> EMPLOYEE_LIST;

    @SuppressWarnings("unchecked")
    public EmployeeDao() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        EMPLOYEE_LIST = new ArrayList<>();

        EMPLOYEE_LIST.add(context.getBean("emp1", Employee.class));
        EMPLOYEE_LIST.add(context.getBean("emp2", Employee.class));
        EMPLOYEE_LIST.add(context.getBean("emp3", Employee.class));
        EMPLOYEE_LIST.add(context.getBean("emp4", Employee.class));
    }

    public ArrayList<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }

}