package com.cognizant.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="em_id")
    private int id;

    @Column(name="em_name")
    private String name;

    @Column(name="em_salary")
    private double salary;

    @Column(name="em_permanent")
    private boolean permanent;

    @Temporal(TemporalType.DATE)
    @Column(name="em_date_of_birth")
    private Date dateOfBirth;

    public Employee() {
    }

    // Generate Getters and Setters

    @Override
    public String toString() {
        return id+" "+name;
    }
}
