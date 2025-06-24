<<<<<<<< HEAD:src/main/java/com/sam/business/ecom/dtos/CustomerResponseDto.java
package com.sam.business.ecom.dtos;
========
<<<<<<<< HEAD:src/main/java/com/sam/business/ecom/dtos/customer/CustomerRequestDto.java
package com.sam.business.ecom.dtos.customer;
========
package com.sam.business.ecom.dto;
>>>>>>>> origin/main:src/main/java/com/sam/business/ecom/dto/CustomerResponseDTO.java
>>>>>>>> main:src/main/java/com/sam/business/ecom/dtos/customer/CustomerRequestDto.java

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
<<<<<<<< HEAD:src/main/java/com/sam/business/ecom/dtos/CustomerResponseDto.java
public class CustomerResponseDto {

    private UUID id;
========
public class CustomerRequestDto {
>>>>>>>> main:src/main/java/com/sam/business/ecom/dtos/customer/CustomerRequestDto.java

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
