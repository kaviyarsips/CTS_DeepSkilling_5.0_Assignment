package com.cognizant.service;

import java.util.List;

import com.cognizant.model.Country;

public interface CountryService {

    List<Country> searchCountry(String text);

    List<Country> searchCountrySorted(String text);

    List<Country> searchCountryByAlphabet(String alphabet);

}