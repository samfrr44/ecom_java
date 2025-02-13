package com.sam.business.ecom.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.business.ecom.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {


//  List<Customer> findByPublished(boolean published);

//  List<Customer> findByNameContaining(String name);
}
