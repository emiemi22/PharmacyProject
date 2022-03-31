package com.example.pharmacy.repository;

import com.example.pharmacy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;


@org.springframework.stereotype.Repository
public class ProductRepo implements Repository {
    private JPARepo jpaRepository;
    @Autowired
    public ProductRepo(JPARepo jpaRepository){
        this.jpaRepository = jpaRepository;
    }
    @Override
    public void addElement(Object o) {
        jpaRepository.save((Product)o);
    }

    @Override
    public void deleteElement(Object o) {

    }

    @Override
    public void updateElement(Object o) {

    }

    @Override
    public List<Object> getAllElements() {
        return Collections.singletonList(jpaRepository.findAll());
    }


    public Object findByName(String productName) {

        List<Product> list = jpaRepository.findAll();

        for(Object x : list){
            Product p = (Product) x;
            if (p.getProductName().equals(productName)){
                return x;
            }
        }
        return null;
    }
}
