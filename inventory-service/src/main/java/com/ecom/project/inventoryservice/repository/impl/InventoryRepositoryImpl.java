package com.ecom.project.inventoryservice.repository.impl;

import com.ecom.project.inventoryservice.dao.InventoryDao;
import com.ecom.project.inventoryservice.model.Inventory;
import com.ecom.project.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class InventoryRepositoryImpl implements InventoryRepository {

    @Autowired
    private InventoryDao inventoryDao;

    @Override
    public Optional<Inventory> findBySkuCode() {
        return inventoryDao.findBySkuCode();
    }
}
