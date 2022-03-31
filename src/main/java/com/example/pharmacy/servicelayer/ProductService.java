package com.example.pharmacy.servicelayer;

import com.example.pharmacy.model.Product;
import com.example.pharmacy.repository.ProductRepo;
import com.example.pharmacy.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * The type Product service.
 */
@Service
public class ProductService {
    private final Repository productRepository;

    /**
     * Instantiates a new Product service.
     *
     * @param productRepository the product repository
     */
    @Autowired
    public ProductService(ProductRepo productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Get products list.
     *
     * @return the list
     */
    public List<Object> getProducts() {
        return productRepository.getAllElements();
    }

    /**
     * Add new product validation boolean.
     * check if a product it is in DB. If it isn't return true
     * it is used findByName method, which it is implemented in ProductRepo
     * @param product the product
     * @return the boolean
     */
    public boolean productValidation(Product product) {
        Product p = (Product) productRepository.findByName(product.getProductName());
        if (p == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Add new product.
     * If the validation succeeds add a new element to DB.
     * @param product the product
     */
    public void addNewProduct(Product product) {

        if (productValidation(product)) {
            productRepository.addElement(product);
        } else {
            throw new IllegalStateException("product already in DB");
        }
    }

    /**
     * Delete product.
     *
     * @param id the product name
     */
    public void deleteProduct(Long id) {
        Product product = (Product) productRepository.findById(id);
        if (product != null) {
            productRepository.deleteElement(product);
        } else {
            throw new IllegalStateException("product is not in DB");
        }

    }
}
