package com.cognizant.ormlearn.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Repository
public class ProductRepositoryImpl implements ProductRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> searchProducts(String ram,
                                        String operatingSystem,
                                        String cpu,
                                        Double customerReview) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Product> cq = cb.createQuery(Product.class);

        Root<Product> product = cq.from(Product.class);

        List<Predicate> predicates = new ArrayList<>();

        if (ram != null && !ram.isEmpty()) {
            predicates.add(cb.equal(product.get("ram"), ram));
        }

        if (operatingSystem != null && !operatingSystem.isEmpty()) {
            predicates.add(cb.equal(product.get("operatingSystem"), operatingSystem));
        }

        if (cpu != null && !cpu.isEmpty()) {
            predicates.add(cb.equal(product.get("cpu"), cpu));
        }

        if (customerReview != null) {
            predicates.add(cb.greaterThanOrEqualTo(product.get("customerReview"), customerReview));
        }

        cq.select(product).where(predicates.toArray(new Predicate[0]));

        return entityManager.createQuery(cq).getResultList();
    }
}