package com.sam.business.ecom.translator;

import com.sam.business.ecom.dtos.CustomerRequestDTO;
import com.sam.business.ecom.dtos.CustomerResponseDTO;
import com.sam.business.ecom.dtos.CustomerResponseDTO_ID;
import com.sam.business.ecom.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerTranslator {
    public Customer toEntity(CustomerRequestDTO dto){
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
    public CustomerResponseDTO toDTO(Customer entity){
        return CustomerResponseDTO.builder()
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
    public CustomerResponseDTO_ID toDTO_ID(Customer entity) {
        return CustomerResponseDTO_ID.builder()
                .id(entity.getId())
                .build();

    }
}

