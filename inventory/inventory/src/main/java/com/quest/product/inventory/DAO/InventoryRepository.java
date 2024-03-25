package com.quest.product.inventory.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quest.product.inventory.DAO.entity.ProductEntity;


@Repository
public interface InventoryRepository extends JpaRepository<ProductEntity,Integer>
{

}
