package com.ecom.project.inventoryservice.dao;

import com.ecom.project.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryDao extends JpaRepository<Inventory, Integer> {



    Optional<Inventory> findBySkuCode();
}
