package com.ecom.project.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineitemDto {
    private Integer id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
