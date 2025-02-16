package com.sam.business.ecom.service;

import com.sam.business.ecom.dto.CustomerRequestDTO;
import com.sam.business.ecom.dto.CustomerResponseDTO;
import com.sam.business.ecom.dto.CustomerResponseDTO_ID;
import com.sam.business.ecom.model.Customer;
import com.sam.business.ecom.repository.CustomerRepository;
import com.sam.business.ecom.translator.CustomerTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerTranslator translator;

    public CustomerResponseDTO_ID saveNewCustomer (CustomerRequestDTO customerRequestDTO){

        Customer new_customer = customerRepository.save(new Customer(
                customerRequestDTO.getName(),
                customerRequestDTO.getLastName(),
                customerRequestDTO.getAddress(),
                customerRequestDTO.getAddress2(),
                customerRequestDTO.getCity(),
                customerRequestDTO.getZipcode(),
                customerRequestDTO.getCountry(),
                customerRequestDTO.getEmail(),
                customerRequestDTO.getPhone()
        ));

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

    public void removeCustomer(UUID id){
        customerRepository.deleteById(id);
    }
//
//   public CustomerResponseDTO saveNewCustomer(CustomerRequestDTO dto) {
//        Customer entity = translator.toEntity(dto);
//        return translator.toDTO(customerRepository.save(entity));
//    }
}
