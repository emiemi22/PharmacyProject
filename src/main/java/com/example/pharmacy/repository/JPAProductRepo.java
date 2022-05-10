package com.example.pharmacy.repository;

import com.example.pharmacy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Jpa product repo.
 */
public interface JPAProductRepo extends JpaRepository<Product,Long> {
}
