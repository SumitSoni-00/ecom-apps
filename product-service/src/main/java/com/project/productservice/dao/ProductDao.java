package com.project.productservice.dao;

import com.project.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
