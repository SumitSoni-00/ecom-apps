package com.ecom.project.inventoryservice.service.impl;


import com.ecom.project.inventoryservice.repository.InventoryRepository;
import com.ecom.project.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {


    private final InventoryRepository inventoryRepository;


    @Override
    @Transactional
    public boolean isInStock(String skuCode) {
        return inventoryRepository.findBySkuCode().isPresent() ;
    }
}
