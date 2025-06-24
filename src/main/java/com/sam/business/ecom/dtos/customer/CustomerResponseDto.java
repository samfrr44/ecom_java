package com.sam.business.ecom.dtos.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CustomerResponseDto {

    private UUID id;

    @JsonProperty("first_name")
    private String name;

    @JsonProperty("last_name")
    private String lname;

    private String address;

    private String city;

    private String state;

    private String country;

    private Integer zipcode;

    private String email;

    private String phone;

    public CustomerResponseDto(UUID id, String name, String lname, String address, String city, String state,
                               Integer zipcode, String country, String email, String phone) {
    }

}
