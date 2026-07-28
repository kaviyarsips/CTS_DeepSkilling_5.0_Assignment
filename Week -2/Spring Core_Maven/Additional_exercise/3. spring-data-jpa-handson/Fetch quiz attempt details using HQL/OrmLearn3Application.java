package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Attempt;
import com.cognizant.ormlearn.service.AttemptService;

@SpringBootApplication
public class OrmLearn3Application implements CommandLineRunner {

    @Autowired
    private AttemptService attemptService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearn3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("======================================");
        System.out.println("QUIZ ATTEMPT DETAILS");
        System.out.println("======================================");

        Attempt attempt = attemptService.getAttempt(1, 1);

        if (attempt != null) {

            System.out.println("User Name       : " + attempt.getUser().getName());
            System.out.println("Attempt Date    : " + attempt.getDate());

        } else {

            System.out.println("No Attempt Found");

        }
    }
}