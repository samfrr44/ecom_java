package com.sam.business.ecom.controllers;

import com.sam.business.ecom.dtos.CustomerRequestDto;
import com.sam.business.ecom.dtos.CustomerResponseDto;
import com.sam.business.ecom.dtos.Customer_IdResponseDto;
import com.sam.business.ecom.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/customer")

public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/save" , method = RequestMethod.POST)
	public Customer_IdResponseDto save(@RequestBody CustomerRequestDto customerRequestDTO){
		return customerService.saveNewCustomer(customerRequestDTO);

	}

//	@RequestMapping(value = "/all-details" , method = RequestMethod.GET)
//	public List<CustomerDTO> getALl() {
//		return customerService.getALlStudents();
//	}

	@GetMapping("/{id}")
	public CustomerResponseDto getCustomerById(@PathVariable("id") String id) {
		return customerService.findCustomerById(id);
	}

	@GetMapping("/zipcode/{zipcode}")
	public CustomerResponseDto getCustomerByZipcode(@PathVariable("zipcode") Integer zipcode) {
		return (CustomerResponseDto) customerService.findCustomerByZipcode(zipcode);
	}

	@RequestMapping(value = "delete/{id}" , method = RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable("id") UUID id) {
		customerService.removeCustomer(id);
	}

}
