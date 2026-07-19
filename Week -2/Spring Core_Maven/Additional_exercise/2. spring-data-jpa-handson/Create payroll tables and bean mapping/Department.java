package com.cognizant.model;

import jakarta.persistence.*;

@Entity
@Table(name="department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dp_id")
    private int id;

    @Column(name="dp_name")
    private String name;

    public Department() {
    }

    // Generate Getters and Setters

    @Override
    public String toString() {
        return id+" "+name;
    }
}