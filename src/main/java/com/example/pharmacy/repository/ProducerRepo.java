package com.example.pharmacy.repository;

import com.example.pharmacy.model.Producer;
import com.example.pharmacy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
@org.springframework.stereotype.Repository
public class ProducerRepo implements Repository{
    private JPAProducerRepo jpaRepository;

    @Autowired
    public ProducerRepo(JPAProducerRepo jpaRepo){
        this.jpaRepository = jpaRepo;
    }

    @Override
    public void addElement(Object o) {
        jpaRepository.save((Producer)o);
    }

    @Override
    public void deleteElement(Object o) {
        Producer p = (Producer) o ;
        //throw new IllegalStateException(p.toString());
        jpaRepository.deleteById(p.getIdProducer());

    }

    @Override
    public void updateElement(Object o) {
        Producer p = (Producer) o ;
        if(jpaRepository.existsById(p.getIdProducer())){
            jpaRepository.deleteById(p.getIdProducer());
            jpaRepository.save(p);
        }
        else
        {
            throw new IllegalStateException("Producer not in DB!");
        }
    }

    @Override
    public List<Object> getAllElements() {
        return Collections.singletonList(jpaRepository.findAll());
    }

    @Override
    public Object findByName(String name) {

        List<Producer> list = jpaRepository.findAll();

        for(Object x : list){
            Producer p = (Producer) x;
            if (p.getProducerName().equals(name)){
                return x;
            }
        }
        return null;
    }

    @Override
    public Object findById(Long id) {
        List<Producer> list = jpaRepository.findAll();

        for(Object x : list){
            Producer p = (Producer) x;
            if (p.getIdProducer() == id ){
                //throw new IllegalStateException(x.toString());
                return x;
            }
        }
        return null;
    }
}
