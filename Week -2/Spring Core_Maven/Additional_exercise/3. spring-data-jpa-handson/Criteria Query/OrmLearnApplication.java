package com.cognizant.ormlearn;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Product;
import com.cognizant.ormlearn.service.ProductService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    private final ProductService service;

    public OrmLearnApplication(ProductService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {

        List<Product> products =
                service.searchProducts("16GB",
                                       "Windows 11",
                                       "Intel i7",
                                       4.5);

        products.forEach(System.out::println);

    }
}