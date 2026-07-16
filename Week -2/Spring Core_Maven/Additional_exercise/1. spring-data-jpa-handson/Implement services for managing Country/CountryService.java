package com.cognizant.service;

import java.util.List;

import com.cognizant.model.Country;

public interface CountryService {

    Country getCountry(String code);

    Country addCountry(Country country);

    Country updateCountry(Country country);

    void deleteCountry(String code);

    List<Country> searchCountry(String name);

}