package com.example.pharmacy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * The type Pharmacy application.
 */
@SpringBootApplication

public class PharmacyApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    @Autowired
    public static void main(String[] args) {
        SpringApplication.run(PharmacyApplication.class, args);
    }

}
