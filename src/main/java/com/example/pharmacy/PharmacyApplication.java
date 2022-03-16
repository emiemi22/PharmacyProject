package com.example.pharmacy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class PharmacyApplication {

    @Autowired
    //private JdbcTemplate jdbcTemplate;
    public static void main(String[] args) {
        SpringApplication.run(PharmacyApplication.class, args);
    }

}
