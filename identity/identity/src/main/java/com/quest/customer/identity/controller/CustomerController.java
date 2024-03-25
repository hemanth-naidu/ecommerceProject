package com.quest.customer.identity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quest.customer.identity.model.Customer;
import com.quest.customer.identity.service.CustomerService;

@RestController
@RequestMapping(value = "/v1")
public class CustomerController 
{
	@Autowired
	private CustomerService customerService;
	@RequestMapping(value = "/customer",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean addCustomer(@RequestBody Customer customer)
	{
		
		return customerService.saveCustomer(customer);
	}
	
	@RequestMapping(value = "/customer/validate",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean validate(@RequestBody Customer customer)
	{
		
		return customerService.validateCustomer(customer);
	}
}
