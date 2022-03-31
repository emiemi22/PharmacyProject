package com.example.pharmacy.controller;

import com.example.pharmacy.servicelayer.ProductService;
import com.example.pharmacy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Product controller.
 */
@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    private final ProductService productService;

    /**
     * Instantiates a new Product controller.
     *
     * @param productService the product service
     */
    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    /**
     * Get products list.
     *
     * @return the list
     */
    @GetMapping
    public List<Object> getProducts(){
        return productService.getProducts();
    }

    /**
     * Add new product.
     *
     * @param product the product
     */
    @PostMapping
    public void addNewProduct(@RequestBody Product product){
        productService.addNewProduct(product);
    }

    /**
     * Delete product.
     *
     * @param productName the product name
     */
//path variable
    @DeleteMapping(path = "{productName}")
    public void deleteProduct(@PathVariable("productName") String productName){
        productService.deleteProduct(productName);
    }
}
