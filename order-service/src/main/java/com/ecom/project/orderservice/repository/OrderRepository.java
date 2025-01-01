package com.ecom.project.orderservice.repository;

import com.ecom.project.orderservice.model.Order;

public interface OrderRepository {
    void save(Order order);
}
