package com.sam.business.ecom.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerResponseDTO {

    private UUID id;

    @JsonProperty("first_name")
    private String name;

    @JsonProperty("last_name")
    private String lastName;

    private String address;

    private String address2;

    private String city;

    private Integer zipcode;

    private String country;

    private String email;

    private String phone;

}
