package com.ecom.project.orderservice.service;

import com.ecom.project.orderservice.dto.OrderRequest;

public interface OrderService {


    void placeOrder(OrderRequest orderRequest);
}
