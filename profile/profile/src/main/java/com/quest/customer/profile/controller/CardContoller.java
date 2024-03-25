package com.quest.customer.profile.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quest.customer.profile.model.Card;

@RestController
@RequestMapping(value = "/v1")
public class CardContoller 
{
	@RequestMapping(value = "/card",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public void getCard()
	{
		
	}
	
	@RequestMapping(value = "/card",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public void addCard(@RequestBody Card card)
	{
		
	}

}
