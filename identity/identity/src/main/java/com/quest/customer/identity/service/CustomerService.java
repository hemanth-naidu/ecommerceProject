package com.quest.customer.identity.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quest.customer.identity.DAO.CustomerRepository;
import com.quest.customer.identity.DAO.entity.CustomerEntity;
import com.quest.customer.identity.model.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public boolean saveCustomer(Customer customer)
	{
		Random random=new Random();
		CustomerEntity entity=new CustomerEntity(random.nextInt(1000000),customer.getName(),customer.getUserId(),customer.getPassword());
		
		try
		{
			customerRepository.save(entity);
			
			return true;
			
		}
		catch (Exception e) 
		{
			return false;
		}
	}
	
	public boolean validateCustomer(Customer customer)
	{
		
		try
		{
			String storedCustomer=customerRepository.validate(customer.getUserId(),customer.getPassword());
			if(storedCustomer!=null) {
				System.out.print(storedCustomer);
				if(storedCustomer.equals(customer.getUserId()))
					return true;
			}
			System.out.print("object is null");
			return false;
		
			
		}
		catch (Exception e) 
		{
			System.out.print("errored");
			System.out.print(e.getMessage());
			return false;
		}
	}

}
