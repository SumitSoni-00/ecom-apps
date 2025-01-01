package com.ecom.project.productservice.repository;

import com.ecom.project.productservice.model.Product;

import java.util.List;

public interface ProductRepository {
    void save(Product product);

    List<Product> findAll();
}
