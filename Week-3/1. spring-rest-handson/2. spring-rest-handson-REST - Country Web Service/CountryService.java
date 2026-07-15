package com.cognizant.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.model.Country;

@Service
public class CountryService {

    public Country getCountryIndia() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        return context.getBean("country", Country.class);

    }

}