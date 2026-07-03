package com.cognizant;

public class Country {

    private String code;
    private String name;

    public Country() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Country Code : " + code);
        System.out.println("Country Name : " + name);
    }
}