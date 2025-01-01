package com.ecom.project.productservice.model;

import com.ecom.project.models.common.BaseModel;
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
