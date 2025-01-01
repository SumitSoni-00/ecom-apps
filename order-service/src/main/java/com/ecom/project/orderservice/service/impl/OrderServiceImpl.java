package com.ecom.project.orderservice.service.impl;

import com.ecom.project.orderservice.dto.OrderLineitemDto;
import com.ecom.project.orderservice.dto.OrderRequest;
import com.ecom.project.orderservice.model.Order;
import com.ecom.project.orderservice.model.OrderLineitem;
import com.ecom.project.orderservice.repository.OrderRepository;
import com.ecom.project.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {


    private final OrderRepository orderRepository;

    private final WebClient webClient ;

    @Override
    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineitem> orderLineitems = orderRequest.getOrderLineitemDto().stream().map(this::mapToOrderLineItemEntity).collect(Collectors.toList());
        order.setOrderLineitems(orderLineitems);



        orderRepository.save(order);


    }

    private OrderLineitem mapToOrderLineItemEntity(OrderLineitemDto orderLineitemDto) {


        return OrderLineitem.builder().price(orderLineitemDto.getPrice()).skuCode(orderLineitemDto.getSkuCode())
                .quantity(orderLineitemDto.getQuantity()).build();



    }


}
