package com.project.productservice.web.controller;

import com.project.productservice.dto.ProductRequest;
import com.project.productservice.dto.ProductResponse;
import com.project.productservice.entity.Product;
import com.project.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private static final Logger LOGGER= LoggerFactory.getLogger(ProductController.class);

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest ){
        productService.createProduct(productRequest);

    }

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }
}
