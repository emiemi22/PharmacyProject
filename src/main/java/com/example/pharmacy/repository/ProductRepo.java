package com.example.pharmacy.repository;

import com.example.pharmacy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * The type Product repo.
 */
@org.springframework.stereotype.Repository
public class ProductRepo implements Repository {
    private JPAProductRepo jpaRepository;

    /**
     * Instantiates a new Product repo.
     *
     * @param jpaRepository the jpa repository
     */
    @Autowired
    public ProductRepo(JPAProductRepo jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public void addElement(Object o) {
        jpaRepository.save((Product) o);
    }

    @Override
    public void deleteElement(Object o) {
        Product p = (Product) o;
        jpaRepository.deleteById(p.getId());
    }

    @Override
    public void updateElement(Long id, Object o) {
        //Object objFromRepo = jpaRepository.findById(id);
        jpaRepository.save((Product) o);
    }

    @Override
    public List<Object> getAllElements() {
        List<Object> listOfObjects = new ArrayList<>();
        List<Product> listOfProducts = jpaRepository.findAll();
        for(Product p : listOfProducts){
            listOfObjects.add(p);
        }
        return listOfObjects;
    }

    @Override
    public Object findByName(String productName) {

        List<Product> list = jpaRepository.findAll();
        //List<Object> list = this.getAllElements();

        for (Object x : list) {
            Product p = (Product) x;
            if (p.getProductName().equals(productName)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public Object findById(Long id) {
        List<Product> list = jpaRepository.findAll();

        for (Object x : list) {
            Product p = (Product) x;
            if (p.getId() == id) {
                return x;
            }
        }
        return null;
    }
}
