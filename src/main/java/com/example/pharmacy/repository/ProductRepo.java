package com.example.pharmacy.repository;
import com.example.pharmacy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collections;
import java.util.List;


@org.springframework.stereotype.Repository
public class ProductRepo implements Repository {
    private JPAProductRepo jpaRepository;
    @Autowired
    public ProductRepo(JPAProductRepo jpaRepository){
        this.jpaRepository = jpaRepository;
    }
    @Override
    public void addElement(Object o) {
        jpaRepository.save((Product)o);
    }

    @Override
    public void deleteElement(Object o) {
        Product p = (Product)o;
        jpaRepository.deleteById(p.getId());
    }

    @Override
    public void updateElement(Object o) {
        Product p = (Product) o ;
        if(jpaRepository.existsById(p.getId())){
            jpaRepository.deleteById(p.getId());
            jpaRepository.save(p);
        }
        else
        {
            throw new IllegalStateException("Product not in DB!");
        }
    }

    @Override
    public List<Object> getAllElements() {
        return Collections.singletonList(jpaRepository.findAll());
    }

    @Override
    public Object findByName(String productName) {

        List<Product> list = jpaRepository.findAll();
        //List<Object> list = this.getAllElements();

        for(Object x : list){
            Product p = (Product) x;
            if (p.getProductName().equals(productName)){
                return x;
            }
        }
        return null;
    }

    @Override
    public Object findById(Long id) {
        List<Product> list = jpaRepository.findAll();

        for(Object x : list){
            Product p = (Product) x;
            if (p.getId() == id ){
                return x;
            }
        }
        return null;
    }
}
