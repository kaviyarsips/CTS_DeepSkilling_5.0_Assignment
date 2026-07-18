package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Country;
import com.cognizant.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    private CountryRepository repository;

    @Override
    public List<Country> searchCountry(String text) {

        return repository.findByNameContaining(text);

    }

    @Override
    public List<Country> searchCountrySorted(String text) {

        return repository.findByNameContainingOrderByNameAsc(text);

    }

    @Override
    public List<Country> searchCountryByAlphabet(String alphabet) {

        return repository.findByNameStartingWith(alphabet);

    }

}