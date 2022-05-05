package com.example.pharmacy.repository;
import com.example.pharmacy.model.Users.BasicUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPAUserRepo extends JpaRepository<BasicUser, Long> {
}
