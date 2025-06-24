package com.sam.business.ecom.translators;

import com.sam.business.ecom.dtos.customer.CustomerRequestDto;
import com.sam.business.ecom.dtos.customer.CustomerResponseDto;
import com.sam.business.ecom.dtos.customer.Customer_IdResponseDto;
import com.sam.business.ecom.models.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerTranslator {
    public Customer toEntity(CustomerRequestDto dto){
        return new Customer(dto.getName(), dto.getLname(), dto.getAddress(),
				dto.getCity(),  dto.getState(), dto.getZipcode(), dto.getCountry(),
                dto.getEmail(), dto.getPhone());
    }

    public CustomerResponseDto toDTO(Customer entity){
        CustomerResponseDto dto = new CustomerResponseDto();
            dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setLname(entity.getLname());
			dto.setAddress(entity.getAddress());
			dto.setCity(entity.getCity());
			dto.setState(entity.getState());
			dto.setZipcode(entity.getZipcode());
			dto.setCountry(entity.getCountry());
			dto.setEmail(entity.getEmail());
			dto.setPhone(entity.getPhone());
        return dto;
    }

	public Customer_IdResponseDto toDTO_ID(Customer entity) {
		return Customer_IdResponseDto.builder()
				.id(entity.getId())
				.build();
	}
}

