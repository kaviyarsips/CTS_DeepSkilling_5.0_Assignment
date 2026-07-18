package com.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.model.Country;

public interface CountryRepository extends JpaRepository<Country,String>{

    // Search containing text
    List<Country> findByNameContaining(String text);

    // Search containing text and order by name
    List<Country> findByNameContainingOrderByNameAsc(String text);

    // Search starting with alphabet
    List<Country> findByNameStartingWith(String alphabet);

}