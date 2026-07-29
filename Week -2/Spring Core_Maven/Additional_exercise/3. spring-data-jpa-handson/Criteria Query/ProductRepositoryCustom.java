package com.cognizant.ormlearn.repository;

import java.util.List;

import com.cognizant.ormlearn.model.Product;

public interface ProductRepositoryCustom {

    List<Product> searchProducts(String ram,
                                 String operatingSystem,
                                 String cpu,
                                 Double customerReview);

}