package com.sam.business.ecom.services;

import com.sam.business.ecom.dtos.order.OrderRequestDto;
import com.sam.business.ecom.dtos.order.OrderResponseDto;
import com.sam.business.ecom.dtos.order.Order_IdResponseDto;
import com.sam.business.ecom.models.Order;
import com.sam.business.ecom.repositories.OrderRepository;
import com.sam.business.ecom.translators.OrderTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderTranslator translator;

    public Order_IdResponseDto createNewOrder (OrderRequestDto orderRequestDTO){

        Order new_order = orderRepository.save(Order.builder()
                .customer_id(orderRequestDTO.getCustomer_id())
                .product_id(orderRequestDTO.getProduct_id())
                .quant(orderRequestDTO.getQuant())
                .date(orderRequestDTO.getDate())
                .build()
        );

        return translator.toDTO_ID(new_order);
    }

    public OrderResponseDto findOrderById(String id){

        Order order = orderRepository.findById(UUID.fromString(id)).get();

        return translator.toDTO(order);
    }

    public OrderResponseDto updateOrder(String id, OrderRequestDto dto) {

        Order order = orderRepository.findById(UUID.fromString(id)).get();
        if (dto.getCustomer_id() != null) order.setCustomer_id(dto.getCustomer_id());
        if (dto.getProduct_id() != null) order.setProduct_id(dto.getProduct_id());
        if (dto.getQuant() != null) order.setQuant(dto.getQuant());
        if (dto.getDate() != null) order.setDate(dto.getDate());

        return translator.toDTO(orderRepository.save(order));
    }

    public void deleteOrder(UUID id) {
        orderRepository.deleteById(id);
    }
}
