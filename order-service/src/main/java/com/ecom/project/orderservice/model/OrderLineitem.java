package com.ecom.project.orderservice.model;

import com.ecom.project.models.common.BaseModel;
import jakarta.persistence.Entity;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
public class OrderLineitem extends BaseModel {

    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
