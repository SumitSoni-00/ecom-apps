package com.ecom.project.productservice.dto;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public class ProductResponse {
    private String name;
    private String description;
    private BigDecimal price;
}
