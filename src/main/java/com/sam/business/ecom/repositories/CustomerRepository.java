package com.sam.business.ecom.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.business.ecom.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}
