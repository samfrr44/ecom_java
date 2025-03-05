package com.sam.business.ecom.translator;

import com.sam.business.ecom.dtos.CustomerRequestDto;
import com.sam.business.ecom.dtos.CustomerResponseDto;
import com.sam.business.ecom.dtos.Customer_IdResponseDto;
import com.sam.business.ecom.models.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerTranslator {
    public Customer toEntity(CustomerRequestDto dto){
        return Customer.builder()
                .name(dto.getName())
                .lastName(dto.getLastName())
                .address(dto.getAddress())
                .address2(dto.getAddress2())
                .city(dto.getCity())
                .zipcode(dto.getZipcode())
                .country(dto.getCountry())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .build();
    }
    public CustomerResponseDto toDTO(Customer entity){
        return CustomerResponseDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .lastName(entity.getLastName())
                .address(entity.getAddress())
                .address2(entity.getAddress2())
                .city(entity.getCity())
                .zipcode(entity.getZipcode())
                .country(entity.getCountry())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .build();

    }
    public Customer_IdResponseDto toDTO_ID(Customer entity) {
        return Customer_IdResponseDto.builder()
                .id(entity.getId())
                .build();

    }
}

