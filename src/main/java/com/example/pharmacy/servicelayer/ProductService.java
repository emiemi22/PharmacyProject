package com.example.pharmacy.servicelayer;

import com.example.pharmacy.model.Product;
import com.example.pharmacy.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository ){
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public boolean addNewProductValidation(Product product){
        Optional<Product> productOptional = productRepository.findByProductName(product.getProductName());

        if (productOptional.isPresent()){
            return false;
        }
        else{
            return true;
        }

    }
    public void addNewProduct(Product product){

        if (addNewProductValidation(product)){
            System.out.println(product);
            productRepository.save(product);
        }
        else {
            throw new IllegalStateException("product already in DB");
        }
    }
}
