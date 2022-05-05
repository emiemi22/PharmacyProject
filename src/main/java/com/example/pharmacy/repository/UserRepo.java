package com.example.pharmacy.repository;

import com.example.pharmacy.model.Users.BasicUser;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserRepo implements Repository{

    private JPAUserRepo jpaRepository;
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
    public void updateElement(Object o) {

    }

    @Override
    public List<Object> getAllElements() {
        return null;
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
