package com.project.productservice.service;

import com.project.productservice.dto.ProductRequest;
import com.project.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    public void createProduct(ProductRequest productRequestBody) ;

    List<ProductResponse> getAllProducts();
}
