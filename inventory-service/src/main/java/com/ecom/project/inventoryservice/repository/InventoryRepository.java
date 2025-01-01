package com.ecom.project.inventoryservice.repository;


import com.ecom.project.inventoryservice.model.Inventory;

import java.util.Optional;

public interface InventoryRepository {
    Optional<Inventory> findBySkuCode();
}
