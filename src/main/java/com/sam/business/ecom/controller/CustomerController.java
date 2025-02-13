package com.sam.business.ecom.controller;

import com.sam.business.ecom.dto.CustomerRequestDTO;
import com.sam.business.ecom.dto.CustomerResponseDTO;
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
	public void save(@RequestBody CustomerRequestDTO customerRequestDTO){
		customerService.saveNewCustomer(customerRequestDTO);
	}

//	@RequestMapping(value = "/all-details" , method = RequestMethod.GET)
//	public List<CustomerDTO> getALl() {
//		return customerService.getALlStudents();
//	}

	@RequestMapping(value = "/find/{id}" , method = RequestMethod.GET)
	public CustomerResponseDTO getCustomer(@PathVariable("id") String id) {
		return customerService.findCustomerById(id);
	}

	@RequestMapping(value = "delete/{id}" , method = RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable("id") UUID id) {
		customerService.removeCustomer(id);
	}

}
