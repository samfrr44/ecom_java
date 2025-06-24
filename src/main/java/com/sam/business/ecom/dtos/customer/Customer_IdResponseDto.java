package com.sam.business.ecom.dtos.customer;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer_IdResponseDto {

    private UUID id;

}