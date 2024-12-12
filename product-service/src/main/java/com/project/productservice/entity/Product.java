package com.project.productservice.entity;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
public class Product extends BaseModel {

    private String name;
    private String description;
    private BigDecimal price;
}
