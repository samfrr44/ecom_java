package com.sam.business.ecom.dtos.order;

import com.sam.business.ecom.models.Order;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderResponseDto {

    private UUID id;

    private UUID customer_id;

    private UUID product_id;

    private Integer quant;

    private String date;

//    public OrderResponseDto(UUID id, Order customer_id, Order product_id, Integer quant, String date) {
//    }
}
