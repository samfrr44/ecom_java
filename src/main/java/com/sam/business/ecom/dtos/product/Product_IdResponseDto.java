package com.sam.business.ecom.dtos.product;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product_IdResponseDto {

    private UUID id;
}
