package com.cognizant.model;

import jakarta.persistence.*;

@Entity
@Table(name="skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sk_id")
    private int id;

    @Column(name="sk_name")
    private String name;

    public Skill() {
    }

    // Generate Getters and Setters

    @Override
    public String toString() {
        return id+" "+name;
    }
}