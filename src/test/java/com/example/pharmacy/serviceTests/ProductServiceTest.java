package com.example.pharmacy.serviceTests;

import com.example.pharmacy.model.Product;
import com.example.pharmacy.repository.ProductRepo;
import com.example.pharmacy.servicelayer.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductServiceTest {
    @Mock
    private ProductRepo productRepo;
    @InjectMocks
    private ProductService productService;
    @Test
    public void testGetProducts(){
        Product product1 = new Product("ibuprofen",12.1,1,45);
        Product product2 = new Product("nurofen",11.7,1,45);
        List<Object> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        when(productRepo.getAllElements()).thenReturn(products);//type
        Assertions.assertEquals(products, productService.getProducts()); // values
        Assertions.assertEquals(productService.getProducts().size(), 2);
        assertThat(productService.getProducts().get(0)).isNotEqualTo(product2);
    }
    @Test
    public void testProductValidation(){
        Product product1 = new Product("ibuprofen",12.1,1,45);
        Product product2 = new Product("nurofen",11.7,1,45);
        Product product3 = new Product("aerius",11.7,1,45);
        when(productRepo.findByName("nurofen")).thenReturn(product2);
        assertThat(productService.productValidation(product2)).isEqualTo(false);
        assertThat(productService.productValidation(product3)).isEqualTo(true);
    }
}



