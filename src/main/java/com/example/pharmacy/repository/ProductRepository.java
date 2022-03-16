package com.example.pharmacy.repository;

import com.example.pharmacy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// for data access
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
