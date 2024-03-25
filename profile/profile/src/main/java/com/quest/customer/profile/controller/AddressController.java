package com.quest.customer.profile.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quest.customer.profile.model.Address;


@RestController
@RequestMapping(value = "/v1")
public class AddressController 
{
	
	@RequestMapping(value = "/address",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public void getAddress()
	{
		
	}
	
	@RequestMapping(value = "/address",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public void addAddress(@RequestBody Address address)
	{
		
	}

}
