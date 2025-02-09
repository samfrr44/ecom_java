package com.sam.company.ecom.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.company.ecom.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {


//  List<Customer> findByPublished(boolean published);

//  List<Customer> findByNameContaining(String name);
}
