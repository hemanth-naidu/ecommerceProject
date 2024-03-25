package com.quest.customer.identity.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.quest.customer.identity.DAO.entity.CustomerEntity;
import com.quest.customer.identity.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>{
	
	@Query(value="select customer_userid from customer_db.customer_tb where customer_userid = ?1 and customer_password = ?2 ",nativeQuery=true)
	String validate(String customerId,String customerPassword);

}
