package com.cognizant.search;

import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(105, "Laptop", "Electronics"),

                new Product(101, "Shoes", "Fashion"),

                new Product(103, "Phone", "Electronics"),

                new Product(102, "Watch", "Accessories"),

                new Product(104, "Bag", "Fashion")

        };

        System.out.println("Linear Search");

        Product result = SearchAlgorithms.linearSearch(products, 103);

        if (result != null)
            result.display();
        else
            System.out.println("Product Not Found");

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println();

        System.out.println("Binary Search");

        Product result2 = SearchAlgorithms.binarySearch(products, 103);

        if (result2 != null)
            result2.display();
        else
            System.out.println("Product Not Found");

    }

}