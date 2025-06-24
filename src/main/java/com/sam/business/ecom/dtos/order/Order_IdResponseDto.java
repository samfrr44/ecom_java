package com.sam.business.ecom.dtos.order;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order_IdResponseDto {

    private UUID id;
}
