package com.example.pharmacy.repository.UserRepository;
import com.example.pharmacy.model.Users.BasicUser;
import com.example.pharmacy.model.Users.RequestUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Jpa user repo.
 */
public interface JPAUserRepo extends JpaRepository<RequestUser, Long> {
}
