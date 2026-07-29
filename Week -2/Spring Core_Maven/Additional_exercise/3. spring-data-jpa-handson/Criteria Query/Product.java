package com.cognizant.ormlearn.model;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name="customer_review")
    private double customerReview;

    @Column(name="hard_disk")
    private String hardDisk;

    private String ram;

    @Column(name="cpu_speed")
    private double cpuSpeed;

    @Column(name="operating_system")
    private String operatingSystem;

    private double weight;

    private String cpu;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCustomerReview() {
        return customerReview;
    }

    public void setCustomerReview(double customerReview) {
        this.customerReview = customerReview;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name +
                ", customerReview=" + customerReview +
                ", hardDisk=" + hardDisk +
                ", ram=" + ram +
                ", cpuSpeed=" + cpuSpeed +
                ", operatingSystem=" + operatingSystem +
                ", weight=" + weight +
                ", cpu=" + cpu + "]";
    }
}