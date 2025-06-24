package com.sam.business.ecom.dtos.order;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequestDto {

    private UUID customer_id;

    private UUID product_id;

    private Integer quant;

    private String date;

}
