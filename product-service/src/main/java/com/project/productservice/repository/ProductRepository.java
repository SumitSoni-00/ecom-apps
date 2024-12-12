package com.project.productservice.repository;

import com.project.productservice.entity.Product;

import java.util.List;

public interface ProductRepository {
    void save(Product product);

    List<Product> findAll();
}
