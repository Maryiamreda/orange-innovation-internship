package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository; // provides pre-built methods for database operations
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // Indicates that this interface is a Spring Data repository.
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByNameContaining(String name);
    List<Product> findByPriceBetween(Integer minPrice, Integer maxPrice);
    Product findByName(String name);
}