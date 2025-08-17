package com.example.demo.entity;
import jakarta.persistence.*;

@Entity //representing data that can be persisted in the database

public class Product {
    @Id  // Marks this field as the primary key
    @GeneratedValue(strategy=GenerationType.AUTO) //generate the identifiers in different ways,
    private Long id;

    private String name;
    private Integer price;

    // Constructors
    public Product() {}

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getPrice() { return price; }
    public void setPrice(Integer price) { this.price = price; }
}


