package com.sam.business.ecom.service;

import com.sam.business.ecom.dtos.CustomerRequestDTO;
import com.sam.business.ecom.dtos.CustomerResponseDTO;
import com.sam.business.ecom.dtos.CustomerResponseDTO_ID;
import com.sam.business.ecom.model.Customer;
import com.sam.business.ecom.repository.CustomerRepository;
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

    public CustomerResponseDTO_ID saveNewCustomer (CustomerRequestDTO customerRequestDTO){

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
    public CustomerResponseDTO findCustomerById(String id){
        Customer customer = customerRepository.findById(UUID.fromString(id)).get();
        return new CustomerResponseDTO(
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

    public List<CustomerResponseDTO> findCustomerByZipcode(Integer zipcode) {
        return customerRepository.findByZipcode(zipcode).stream()
                .map(customer -> CustomerResponseDTO.builder()
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
//   public CustomerResponseDTO saveNewCustomer(CustomerRequestDTO dtos) {
//        Customer entity = translator.toEntity(dtos);
//        return translator.toDTO(customerRepository.save(entity));
//    }
}
