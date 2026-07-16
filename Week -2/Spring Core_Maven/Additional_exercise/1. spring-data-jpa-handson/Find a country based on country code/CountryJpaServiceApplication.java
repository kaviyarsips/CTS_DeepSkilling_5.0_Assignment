package com.cognizant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.exception.CountryNotFoundException;
import com.cognizant.model.Country;
import com.cognizant.service.CountryService;

@SpringBootApplication
public class CountryJpaServiceApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryJpaServiceApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) throws CountryNotFoundException {

        ApplicationContext context =
                SpringApplication.run(CountryJpaServiceApplication.class, args);

        countryService = context.getBean(CountryService.class);

        getCountryByCodeTest();

    }

    private static void getCountryByCodeTest()
            throws CountryNotFoundException {

        LOGGER.info("Start");

        Country country = countryService.findCountryByCode("IN");

        LOGGER.info("Country : {}", country);

        LOGGER.info("End");

    }

}