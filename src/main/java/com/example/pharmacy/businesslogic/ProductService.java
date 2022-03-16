package com.example.pharmacy.businesslogic;

import com.example.pharmacy.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class ProductService {

    @GetMapping
    public List<Product> getProducts(){
        return List.of();
    }
}
