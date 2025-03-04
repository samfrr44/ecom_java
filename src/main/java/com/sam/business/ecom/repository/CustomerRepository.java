package com.sam.business.ecom.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.business.ecom.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {


//  List<Customer> saveNewCustomer(boolean String);

//  List<Customer> findByNameContaining(String name);
}
