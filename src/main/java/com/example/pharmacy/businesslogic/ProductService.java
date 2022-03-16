package com.example.pharmacy.businesslogic;

import com.example.pharmacy.model.Product;
import com.example.pharmacy.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository ){
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }
    public void addNewProduct(Product product){
        //throw new RuntimeException(product.getProductName());
        System.out.println(product);
        productRepository.save(product);
    }
}
