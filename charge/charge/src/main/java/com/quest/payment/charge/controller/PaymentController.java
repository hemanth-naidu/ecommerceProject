package com.quest.payment.charge.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.quest.payment.charge.model.Charge;

@RestController
@RequestMapping(value = "/v1")
public class PaymentController {
	
	@RequestMapping(value = "/charge",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean chargeCard(@RequestBody Charge charge)
	{
		
		if(charge.getCardNo().equals("4444333322221111")) {return true;}
		else return false;
	}

}
