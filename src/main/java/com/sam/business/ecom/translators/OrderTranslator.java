package com.sam.business.ecom.translators;

import com.sam.business.ecom.dtos.order.OrderRequestDto;
import com.sam.business.ecom.dtos.order.OrderResponseDto;
import com.sam.business.ecom.dtos.order.Order_IdResponseDto;
import com.sam.business.ecom.models.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderTranslator {

    public Order toEntity(OrderRequestDto dto){
        return new Order(dto.getCustomer_id(), dto.getProduct_id(), dto.getQuant(), dto.getDate());
    }

    public OrderResponseDto toDTO(Order entity){
        OrderResponseDto dto = new OrderResponseDto();
        dto.setId(entity.getId());
        dto.setCustomer_id(entity.getCustomer_id());
        dto.setProduct_id(entity.getProduct_id());
        dto.setQuant(entity.getQuant());
        dto.setDate(entity.getDate());
        return dto;
    }

    public Order_IdResponseDto toDTO_ID(Order entity) {
        return Order_IdResponseDto.builder()
                .id(entity.getId())
                .build();
    }
}
