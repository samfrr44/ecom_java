package com.sam.business.ecom.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.business.ecom.models.Customer;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {


//  List<Customer> saveNewCustomer(boolean String);

  List<Customer> findByZipcode(Integer zipcode);

  List<Customer> findByName(String name);

  @Query(nativeQuery = true)
  List<Customer> findByCityOrderByName(String city);
}