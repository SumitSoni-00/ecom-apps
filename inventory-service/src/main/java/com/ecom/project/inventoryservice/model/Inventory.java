package com.ecom.project.inventoryservice.model;

import com.ecom.project.models.common.BaseModel;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Inventory extends BaseModel {

    private String skuCode;
    private Integer quantity;


}
