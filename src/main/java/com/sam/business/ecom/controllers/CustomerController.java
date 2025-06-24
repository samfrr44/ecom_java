package com.sam.business.ecom.controllers;

import com.sam.business.ecom.dtos.customer.CustomerRequestDto;
import com.sam.business.ecom.dtos.customer.CustomerResponseDto;
import com.sam.business.ecom.dtos.customer.Customer_IdResponseDto;
import com.sam.business.ecom.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/customer")

public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/create" , method = RequestMethod.POST)
	public Customer_IdResponseDto create(@RequestBody CustomerRequestDto customerRequestDTO){
		return customerService.createNewCustomer(customerRequestDTO);
	}

	@RequestMapping(value = "/{id}" , method = RequestMethod.GET)
	public CustomerResponseDto read(@PathVariable("id") String id) {
		return customerService.findCustomerById(id);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public CustomerResponseDto update(@PathVariable String id, @RequestBody CustomerRequestDto request) {
		return customerService.updateCustomer(id, request);
	}

	@RequestMapping(value = "delete/{id}" , method = RequestMethod.DELETE)
	public ResponseEntity<String> delete(@PathVariable("id") UUID id) {
		customerService.deleteCustomer(id);
		return new ResponseEntity<>("customer deleted", HttpStatus.OK);
	}

}
