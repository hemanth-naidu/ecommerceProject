package com.quest.product.inventory.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quest.product.inventory.DAO.entity.ProductEntity;
import com.quest.product.inventory.service.ProductService;

@RestController
@RequestMapping(value = "/v1")
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping(value = "/products",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductEntity> getProducts() 
	{
		
		return productService.getProducts();
	}
}
