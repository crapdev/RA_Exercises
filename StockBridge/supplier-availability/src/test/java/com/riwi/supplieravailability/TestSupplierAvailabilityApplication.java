package com.riwi.supplieravailability;

import org.springframework.boot.SpringApplication;

public class TestSupplierAvailabilityApplication {

    public static void main(String[] args) {
        SpringApplication.from(SupplierAvailabilityApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
