package com.sam.business.ecom.translator;

import com.sam.business.ecom.dto.CustomerRequestDTO;
import com.sam.business.ecom.dto.CustomerResponseDTO;
import com.sam.business.ecom.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerTranslator {
    public Customer toEntity(CustomerRequestDTO dto){
        return new Customer(dto.getName(), dto.getLastName(), dto.getAddress(),
                dto.getAddress2(), dto.getCity(), dto.getZipcode(), dto.getCountry(),
                dto.getEmail(), dto.getPhone());
    }
    public CustomerResponseDTO toDTO(Customer entity){
        CustomerResponseDTO dto = new CustomerResponseDTO();
            dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setLastName(entity.getLastName());
			dto.setAddress(entity.getAddress());
			dto.setAddress2(entity.getAddress2());
			dto.setCity(entity.getCity());
			dto.setZipcode(entity.getZipcode());
			dto.setCountry(entity.getCountry());
			dto.setEmail(entity.getEmail());
			dto.setPhone(entity.getPhone());
        return dto;
    }
}

