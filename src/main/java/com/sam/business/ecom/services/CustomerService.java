package com.sam.business.ecom.services;

import com.sam.business.ecom.dtos.customer.CustomerRequestDto;
import com.sam.business.ecom.dtos.customer.CustomerResponseDto;
import com.sam.business.ecom.dtos.customer.Customer_IdResponseDto;
import com.sam.business.ecom.models.Customer;
import com.sam.business.ecom.repositories.CustomerRepository;
import com.sam.business.ecom.translators.CustomerTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerTranslator translator;

    public Customer_IdResponseDto createNewCustomer (CustomerRequestDto customerRequestDTO){

        Customer new_customer = customerRepository.save(Customer.builder()
                .name(customerRequestDTO.getName())
                .lname(customerRequestDTO.getLname())
                .address(customerRequestDTO.getAddress())
                .city(customerRequestDTO.getCity())
                .state(customerRequestDTO.getState())
                .zipcode(customerRequestDTO.getZipcode())
                .country(customerRequestDTO.getCountry())
                .email(customerRequestDTO.getEmail())
                .phone(customerRequestDTO.getPhone())
                .build()
        );

        return translator.toDTO_ID(new_customer);
    }

    public CustomerResponseDto findCustomerById(String id){

        Customer customer = customerRepository.findById(UUID.fromString(id)).get();

        return translator.toDTO(customer);
    }

    public CustomerResponseDto updateCustomer(String id, CustomerRequestDto dto) {

        Customer customer = customerRepository.findById(UUID.fromString(id)).get();
        if (dto.getName() != null) customer.setName(dto.getName());
        if (dto.getLname() != null) customer.setLname(dto.getLname());
        if (dto.getAddress() != null) customer.setAddress(dto.getAddress());
        if (dto.getCity() != null) customer.setCity(dto.getCity());
        if (dto.getState() != null) customer.setState(dto.getState());
        if (dto.getZipcode() != null) customer.setZipcode(dto.getZipcode());
        if (dto.getCountry() != null) customer.setCountry(dto.getCountry());
        if (dto.getEmail() != null) customer.setEmail(dto.getEmail());
        if (dto.getPhone() != null) customer.setPhone(dto.getPhone());

        return translator.toDTO(customerRepository.save(customer));
    }

    public void deleteCustomer(UUID id) {
        customerRepository.deleteById(id);
    }

}
