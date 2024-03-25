package com.quest.order.order.controller;



import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.quest.order.order.model.Charge;
import com.quest.order.order.model.Customer;
import com.quest.order.order.model.Product;
import com.quest.order.order.model.Products;

@Controller
public class HomeController 
{
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/route_register",method=RequestMethod.GET)
	public String getRegisterPage()
	{
		return "register";
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getHomePage()
	{
		return "index";
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String getLandingPage()
	{
		return "index";
	}
	

	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String getAboutPage()
	{
		return "about";
	}
	

	@RequestMapping(value="/loginpage",method=RequestMethod.GET)
	public String getLoginPage(@RequestParam String name, @RequestParam String password)
	{
		Customer newCustomer=new Customer();
		
		newCustomer.setUserId(name);
		newCustomer.setPassword(password);
		
		HttpHeaders header=new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Customer> entity=new HttpEntity<Customer>(newCustomer,header);
		String response=restTemplate.exchange("http://localhost:9093/v1/customer/validate",HttpMethod.POST,entity,String.class).getBody();
		System.out.print(response);
		if(response.equals("true"))
			return "login_success";
		return "login_failure";
		
	
	}
	
	@RequestMapping(value="/route_login",method=RequestMethod.GET)
	public String loginPage()
	{
		return "login";
	}
	
	@RequestMapping(value="/checkOut",method=RequestMethod.GET)
	public String checkOuttPage()
	{
		return "checkOut";
	}
	
	@RequestMapping(value="/payment",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public String paymentPage(@RequestParam String cardNo, @RequestParam String expiry, @RequestParam String amount)
	{
		System.out.print(cardNo);
		
		Charge charge=new Charge();
		charge.setAmount(amount);
		charge.setCardNo(cardNo);
		charge.setExpiry(expiry);
		
		
		HttpHeaders header=new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Charge> entity=new HttpEntity<Charge>(charge,header);
		String response=restTemplate.exchange("http://localhost:9096/v1/charge",HttpMethod.POST,entity,String.class).getBody();
		if(response.equals("true"))
			return "orderSuccess";
		return "paymentFailure";
	}
	
	
	
	@RequestMapping(value="/products",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public String getProducts(Model model) throws JsonMappingException, JsonProcessingException{
		HttpHeaders header=new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<String> entity=new HttpEntity<String>(header);
		String response=restTemplate.exchange("http://localhost:9092/v1/products",HttpMethod.GET,entity,String.class).getBody();
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
		
		List<Product> products=mapper.readValue(response,new TypeReference<List<Product>>() {});
		System.out.print(products.size());
		for(Product product : products){
			
			System.out.print(product.getId());
			System.out.print(product.getProductName());
		}
		
		
		model.addAttribute("productlist", products);
		
		return "productsList";
	}
	
	
	
	
	@RequestMapping(value="/register",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public String registerCustomer(@RequestParam String name, @RequestParam String userid, @RequestParam String password)
	{
		Customer newCustomer=new Customer();
		newCustomer.setName(name);
		newCustomer.setUserId(userid);
		newCustomer.setPassword(password);
		
		HttpHeaders header=new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Customer> entity=new HttpEntity<Customer>(newCustomer,header);
		String response=restTemplate.exchange("http://localhost:9093/v1/customer",HttpMethod.POST,entity,String.class).getBody();
		System.out.print(response);
		if(response.equals("true"))
			return "success";
		return "registerFailure";
	}
	
	

}
