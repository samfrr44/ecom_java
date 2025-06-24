package com.sam.business.ecom.dtos.product;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductRequestDto {

    private String name;

    private String manfac;

    private Float price;

    private Integer units;
}
