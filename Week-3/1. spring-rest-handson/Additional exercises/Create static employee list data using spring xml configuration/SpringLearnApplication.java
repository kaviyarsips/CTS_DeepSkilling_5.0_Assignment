package com.cognizant;

import com.cognizant.dao.EmployeeDao;
import com.cognizant.model.Employee;

public class SpringLearnApplication {

    public static void main(String[] args) {

        EmployeeDao dao = new EmployeeDao();

        for (Employee employee : dao.getAllEmployees()) {
            System.out.println(employee);
        }
    }
}