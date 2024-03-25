package com.quest.product.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quest.product.inventory.DAO.InventoryRepository;
import com.quest.product.inventory.DAO.entity.ProductEntity;

@Service
public class ProductService
{
	@Autowired
	private InventoryRepository productRepository;
	
	public List<ProductEntity> getProducts()
	{
		return productRepository.findAll();
	}
}
