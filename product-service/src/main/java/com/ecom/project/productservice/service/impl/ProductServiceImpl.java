package com.ecom.project.productservice.service.impl;

import com.ecom.project.productservice.dto.ProductRequest;
import com.ecom.project.productservice.dto.ProductResponse;
import com.ecom.project.productservice.model.Product;
import com.ecom.project.productservice.repository.ProductRepository;
import com.ecom.project.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public void createProduct(ProductRequest productRequestBody) {

        Product product = Product.builder().name(productRequestBody.getName()).price(productRequestBody.getPrice()).description(productRequestBody.getDescription()).build();
        productRepository.save(product);
        log.info("Product {} is created", product.getId());

    }

    @Override
    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll().stream().map(this::mapToProductResponse).collect(Collectors.toList());
    }

    private ProductResponse mapToProductResponse(Product product) {

        return ProductResponse.builder().name(product.getName()).price(product.getPrice()).description(product.getDescription()).build();
    }
}
