package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Product;
import com.cognizant.ormlearn.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> searchProducts(String ram,
                                        String os,
                                        String cpu,
                                        Double review){

        return repository.searchProducts(ram, os, cpu, review);

    }

}