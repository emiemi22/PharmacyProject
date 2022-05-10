package com.example.pharmacy.controllerTests;

import com.example.pharmacy.controller.ProductController;
import com.example.pharmacy.model.Product;
import com.example.pharmacy.servicelayer.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductControllerTest {
    @InjectMocks
    ProductController productController;
    @Mock
    ProductService productService;

    @Test
    public void testGetProducts() {
        Product product1 = new Product("ibuprofen", 12.1, 1,23);
        Product product2 = new Product("nurofen", 11.7, 1,23);
        List<Object> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        when(productService.getProducts()).thenReturn(products);//type
        Assertions.assertEquals(products, productController.getProducts()); // values
        Assertions.assertEquals(productController.getProducts().size(), 2);
    }

    @Test
    public void testAddNewProduct() {

    }

    @Test
    public void testDeleteProduct() {

    }


}
