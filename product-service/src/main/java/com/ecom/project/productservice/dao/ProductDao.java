package com.ecom.project.productservice.dao;

import com.ecom.project.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
