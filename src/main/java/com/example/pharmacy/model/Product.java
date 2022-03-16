package com.example.pharmacy.model;

import ch.qos.logback.core.status.StatusUtil;

import javax.persistence.*;

@Entity
@Table
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_seq",sequenceName = "product_seq" , allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator ="product_sequence"
    )
    private long id ;
    private String productName;
    private double price;
    private int categoryType;

    public Product(){
    }
    public Product(long id, String productName, double price, int categoryType) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.categoryType = categoryType;
    }

    public Product(String productName, double price, int categoryType) {
        this.productName = productName;
        this.price = price;
        this.categoryType = categoryType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(int categoryType) {
        this.categoryType = categoryType;
    }
}
