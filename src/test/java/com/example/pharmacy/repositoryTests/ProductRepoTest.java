package com.example.pharmacy.repositoryTests;

import com.example.pharmacy.model.Product;
import com.example.pharmacy.repository.ProductRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductRepoTest {
    @Mock
    ProductRepo productRepo;

    @Test
    public void getAllElementsTest() {
        Product product1 = new Product("ibuprofen", 12.1, 1);
        Product product2 = new Product("nurofen", 11.7, 1);
        Product product3 = new Product("nurofen2", 11.7, 1);
        List<Object> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        when(productRepo.getAllElements()).thenReturn(products);
        Assertions.assertEquals(products, productRepo.getAllElements());
        assertThat(productRepo.getAllElements().size()).isEqualTo(2);
        products.add(product3);
        assertThat(productRepo.getAllElements().size()).isNotEqualTo(products);
    }

    @Test
    public void findByNameTest() {
        Product product1 = new Product("ibuprofen", 12.1, 1);
        Product product2 = new Product("nurofen", 11.7, 1);
        when(productRepo.findByName("nurofen")).thenReturn(product1);
        assertThat(productRepo.findByName("nurofen")).isEqualTo(product1);
        assertThat(productRepo.findByName("ibuprofen")).isNotEqualTo(product2);
    }

    @Test
    public void findByIdTest() {
        Product product1 = new Product("ibuprofen", 12.1, 1);
        Product product2 = new Product("nurofen", 11.7, 1);
        when(productRepo.findById(1L)).thenReturn(product1);
        assertThat(productRepo.findById(1L)).isEqualTo(product1);
        assertThat(productRepo.findById(2L)).isNotEqualTo(product1);

    }

}
