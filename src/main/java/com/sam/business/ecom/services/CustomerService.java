package com.sam.business.ecom.services;

import com.sam.business.ecom.dtos.CustomerRequestDto;
import com.sam.business.ecom.dtos.CustomerResponseDto;
import com.sam.business.ecom.dtos.Customer_IdResponseDto;
import com.sam.business.ecom.models.Customer;
import com.sam.business.ecom.repositories.CustomerRepository;
import com.sam.business.ecom.translator.CustomerTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerTranslator translator;

    public Customer_IdResponseDto saveNewCustomer (CustomerRequestDto customerRequestDTO){

        Customer new_customer = customerRepository.save(Customer.builder()
                        .name(customerRequestDTO.getName())
                        .lastName(customerRequestDTO.getLastName())
                        .address(customerRequestDTO.getAddress())
                        .address2(customerRequestDTO.getAddress2())
                        .city(customerRequestDTO.getCity())
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
        return new CustomerResponseDto(
                customer.getId(),
                customer.getName(),
                customer.getLastName(),
                customer.getAddress(),
                customer.getAddress2(),
                customer.getCity(),
                customer.getZipcode(),
                customer.getCountry(),
                customer.getEmail(),
                customer.getPhone()
        );
    }

    public List<CustomerResponseDto> findCustomerByZipcode(Integer zipcode) {
        return customerRepository.findByZipcode(zipcode).stream()
                .map(customer -> CustomerResponseDto.builder()
                        .name(customer.getName())
                        .lastName(customer.getLastName())
                        .address(customer.getAddress())
                        .address2(customer.getAddress2())
                        .city(customer.getCity())
                        .zipcode(customer.getZipcode())
                        .country(customer.getCountry())
                        .email(customer.getEmail())
                        .phone(customer.getPhone())
                        .build()
                )
                        .collect(Collectors.toList());
    }

    public void removeCustomer(UUID id){
        customerRepository.deleteById(id);
    }
//
//   public CustomerResponseDto saveNewCustomer(CustomerRequestDto dtos) {
//        Customer entity = translator.toEntity(dtos);
//        return translator.toDTO(customerRepository.save(entity));
//    }
}
