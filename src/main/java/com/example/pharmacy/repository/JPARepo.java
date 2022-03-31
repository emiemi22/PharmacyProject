package com.example.pharmacy.repository;

import com.example.pharmacy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPARepo extends JpaRepository<Product,Long> {
}
