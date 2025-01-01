package com.ecom.project.productservice.repository.impl;

import com.ecom.project.productservice.dao.ProductDao;
import com.ecom.project.productservice.model.Product;
import com.ecom.project.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductDao productDao;
    @Override
    public void save(Product product) {

        productDao.save(product);

    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }
}
