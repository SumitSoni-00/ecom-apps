package com.ecom.project.productservice.service;

import com.ecom.project.productservice.dto.ProductRequest;
import com.ecom.project.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    public void createProduct(ProductRequest productRequestBody) ;

    List<ProductResponse> getAllProducts();
}
