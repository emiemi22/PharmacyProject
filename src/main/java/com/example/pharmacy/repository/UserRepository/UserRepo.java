package com.example.pharmacy.repository.UserRepository;

import com.example.pharmacy.model.Users.BasicUser;
import com.example.pharmacy.repository.Repository;
import com.example.pharmacy.repository.UserRepository.JPAUserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;

/**
 * The type User repo.
 */
@org.springframework.stereotype.Repository
public class UserRepo implements Repository {

    private JPAUserRepo jpaRepository;

    /**
     * Instantiates a new User repo.
     *
     * @param jpaRepo the jpa repo
     */
    @Autowired
    public UserRepo(JPAUserRepo jpaRepo){
        this.jpaRepository = jpaRepo;
    }
    @Override
    public void addElement(Object o) {
        jpaRepository.save((BasicUser)o);
    }

    @Override
    public void deleteElement(Object o) {

    }

    @Override
    public void updateElement(Long id, Object o) {

    }

    @Override
    public List<Object> getAllElements() {
        return Collections.singletonList(jpaRepository.findAll());
    }

    @Override
    public Object findByName(String name) {
        return null;
    }

    @Override
    public Object findById(Long id) {
        return null;
    }
}
