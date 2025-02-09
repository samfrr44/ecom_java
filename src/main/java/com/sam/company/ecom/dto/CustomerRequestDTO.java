package com.sam.company.ecom.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerRequestDTO {

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

    public CustomerRequestDTO(String name, String lastName, String address, String address2, String city, Integer zipcode,
                    String country, String email, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
        this.email = email;
        this.phone = phone;
    }
}
