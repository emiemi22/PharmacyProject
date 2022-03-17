package com.example.pharmacy.repository;

import com.example.pharmacy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// for data access
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query("SELECT p FROM Product p WHERE p.productName = ?1")
    Optional<Product> findByProductName(String productName);
}
