package com.example.pharmacy.repository;

import com.example.pharmacy.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPAOrderRepo extends JpaRepository<Order,Long> {
}
