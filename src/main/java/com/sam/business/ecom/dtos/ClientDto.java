package com.sam.business.ecom.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClientDto {

    private int id;

    private String name;

    private String email;
}
