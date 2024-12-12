package com.project.productservice.repository.impl;

import com.project.productservice.dao.ProductDao;
import com.project.productservice.entity.Product;
import com.project.productservice.repository.ProductRepository;
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
