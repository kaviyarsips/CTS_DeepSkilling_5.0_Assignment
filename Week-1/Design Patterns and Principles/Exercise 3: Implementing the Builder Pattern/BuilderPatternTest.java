package com.cognizant.builder;

public class BuilderPatternTest {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32 GB")
                .setStorage("1 TB SSD")
                .build();

        gamingPC.display();

        Computer officePC = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("16 GB")
                .setStorage("512 GB SSD")
                .build();

        officePC.display();
    }
}