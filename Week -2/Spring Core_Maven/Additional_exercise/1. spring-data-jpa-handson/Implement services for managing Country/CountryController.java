package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.model.Country;
import com.cognizant.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {

        return service.getCountry(code);
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {

        return service.addCountry(country);
    }

    @PutMapping
    public Country updateCountry(@RequestBody Country country) {

        return service.updateCountry(country);
    }

    @DeleteMapping("/{code}")
    public String deleteCountry(@PathVariable String code) {

        service.deleteCountry(code);
        return "Country Deleted Successfully";
    }

    @GetMapping("/search")
    public List<Country> searchCountry(@RequestParam String name) {

        return service.searchCountry(name);
    }

}