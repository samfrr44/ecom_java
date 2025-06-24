<<<<<<<< HEAD:src/main/java/com/sam/business/ecom/dtos/customer/CustomerRequestDto.java
package com.sam.business.ecom.dtos.customer;
========
package com.sam.business.ecom.dto;
>>>>>>>> origin/main:src/main/java/com/sam/business/ecom/dto/CustomerResponseDTO.java

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sam.business.ecom.model.Customer;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerRequestDto {

    @JsonProperty("first_name")
    private String name;

    @JsonProperty("last_name")
    private String lname;

    private String address;

    private String city;

    private String country;

    private String state;

    private Integer zipcode;

    private String email;

    private String phone;

}
