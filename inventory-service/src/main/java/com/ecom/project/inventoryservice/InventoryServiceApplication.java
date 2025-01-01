package com.ecom.project.inventoryservice;

import com.ecom.project.inventoryservice.dao.InventoryDao;
import com.ecom.project.inventoryservice.model.Inventory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryDao inventoryDao) {
        return args -> {
            Inventory inventory1 = new Inventory();
            inventory1.setQuantity(122);
            inventory1.setSkuCode("Iphonne");


            Inventory inventory2 = new Inventory();
            inventory2.setQuantity(122);
            inventory2.setSkuCode("Iphonne");

            inventoryDao.save(inventory1);
            inventoryDao.save(inventory2);
        };

    }
}
