package com.sam.business.ecom.controller;

import com.sam.business.ecom.dtos.CustomerRequestDTO;
import com.sam.business.ecom.dtos.CustomerResponseDTO;
import com.sam.business.ecom.dtos.CustomerResponseDTO_ID;
import com.sam.business.ecom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/customer")

public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/save" , method = RequestMethod.POST)
	public CustomerResponseDTO_ID save(@RequestBody CustomerRequestDTO customerRequestDTO){
		return customerService.saveNewCustomer(customerRequestDTO);

	}

//	@RequestMapping(value = "/all-details" , method = RequestMethod.GET)
//	public List<CustomerDTO> getALl() {
//		return customerService.getALlStudents();
//	}

	@GetMapping("/{id}")
	public CustomerResponseDTO getCustomerById(@PathVariable("id") String id) {
		return customerService.findCustomerById(id);
	}

	@GetMapping("/zipcode/{zipcode}")
	public CustomerResponseDTO getCustomerByZipcode(@PathVariable("zipcode") Integer zipcode) {
		return (CustomerResponseDTO) customerService.findCustomerByZipcode(zipcode);
	}

	@RequestMapping(value = "delete/{id}" , method = RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable("id") UUID id) {
		customerService.removeCustomer(id);
	}

}
