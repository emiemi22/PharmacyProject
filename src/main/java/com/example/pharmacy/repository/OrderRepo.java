package com.example.pharmacy.repository;

import com.example.pharmacy.model.Order;
import com.example.pharmacy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collections;
import java.util.List;

@org.springframework.stereotype.Repository
public class OrderRepo implements Repository{
    JPAOrderRepo jpaOrderRepo;

    @Autowired
    public OrderRepo(JPAOrderRepo jpaOrderRepo){
        this.jpaOrderRepo = jpaOrderRepo;
    }
    @Override
    public void addElement(Object o) {
        jpaOrderRepo.save((Order) o);
    }

    @Override
    public void deleteElement(Object o) {
        Order order = (Order) o ;
        jpaOrderRepo.delete(order);
    }

    @Override
    public void updateElement(Long id, Object o) {
        jpaOrderRepo.save((Order) o);
    }

    @Override
    public List<Object> getAllElements() {
        return Collections.singletonList(jpaOrderRepo.findAll());
    }

    @Override
    public Object findByName(String name) {
        return null;
    }

    @Override
    public Object findById(Long id) {
        List<Order> list = jpaOrderRepo.findAll();

        for (Object x : list) {
            Order p = (Order) x;
            if (p.getId() == id) {
                return x;
            }
        }
        return null;
    }
}
