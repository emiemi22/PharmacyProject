package com.example.pharmacy.repository;

import com.example.pharmacy.model.Producer;
import com.example.pharmacy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Jpa producer repo.
 */
public interface JPAProducerRepo extends JpaRepository<Producer,Long> {
}
