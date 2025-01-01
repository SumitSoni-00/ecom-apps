package com.ecom.project.orderservice.dao;

import com.ecom.project.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order,Integer> {
}
