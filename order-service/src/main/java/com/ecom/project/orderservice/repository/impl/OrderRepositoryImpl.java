package com.ecom.project.orderservice.repository.impl;

import com.ecom.project.orderservice.dao.OrderDao;
import com.ecom.project.orderservice.model.Order;
import com.ecom.project.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {

    private  OrderDao orderDao;

    @Override
    public void save(Order order){

    }
}
