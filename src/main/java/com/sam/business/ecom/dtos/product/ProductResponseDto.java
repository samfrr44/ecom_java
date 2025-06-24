package com.sam.business.ecom.dtos.product;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductResponseDto {

    private UUID id;

    private String name;

    private String manfac;

    private Float price;

    private Integer units;

//    public ProductResponseDto(UUID id, String name, String manfac, Float price, Integer units) {
//    }
}
