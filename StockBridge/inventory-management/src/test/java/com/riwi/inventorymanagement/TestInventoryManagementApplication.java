package com.riwi.inventorymanagement;

import org.springframework.boot.SpringApplication;

public class TestInventoryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.from(InventoryManagementApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
