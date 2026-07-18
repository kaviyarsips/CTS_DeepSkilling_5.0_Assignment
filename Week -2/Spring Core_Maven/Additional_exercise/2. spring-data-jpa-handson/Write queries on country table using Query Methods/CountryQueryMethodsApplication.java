package com.cognizant;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.model.Country;
import com.cognizant.service.CountryService;

@SpringBootApplication
public class CountryQueryMethodsApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(
                        CountryQueryMethodsApplication.class,args);

        CountryService service =
                context.getBean(CountryService.class);

        System.out.println("Search by 'ou'");

        List<Country> countries =
                service.searchCountry("ou");

        countries.forEach(System.out::println);

        System.out.println();

        System.out.println("Sorted");

        service.searchCountrySorted("ou")
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Starting with Z");

        service.searchCountryByAlphabet("Z")
                .forEach(System.out::println);

    }

}