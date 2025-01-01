package com.ecom.project.orderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.ecom.project.models.common.BaseModel;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "`ORDER`")
public class Order  extends BaseModel{

    private String orderNumber;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(joinColumns = {
            @JoinColumn(name = "ORDER_ID")
    },inverseJoinColumns = {
            @JoinColumn(name = "ORDER_LINE_ITEMS_ID",unique = true)
    })
    private List<OrderLineitem> orderLineitems;

}
