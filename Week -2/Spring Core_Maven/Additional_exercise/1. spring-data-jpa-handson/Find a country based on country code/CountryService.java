package com.cognizant.service;

import org.springframework.transaction.annotation.Transactional;

import com.cognizant.exception.CountryNotFoundException;
import com.cognizant.model.Country;

public interface CountryService {

    @Transactional
    Country findCountryByCode(String countryCode)
            throws CountryNotFoundException;

}