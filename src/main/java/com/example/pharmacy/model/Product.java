package com.example.pharmacy.model;

import ch.qos.logback.core.status.StatusUtil;

import javax.persistence.*;

/**
 * The type Product.
 */
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

    /**
     * Instantiates a new Product.
     */
    public Product(){
    }

    /**
     * Instantiates a new Product.
     *
     * @param id           the id
     * @param productName  the product name
     * @param price        the price
     * @param categoryType the category type
     */
    public Product(long id, String productName, double price, int categoryType) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.categoryType = categoryType;
    }

    /**
     * Instantiates a new Product.
     *
     * @param productName  the product name
     * @param price        the price
     * @param categoryType the category type
     */
    public Product(String productName, double price, int categoryType) {
        this.productName = productName;
        this.price = price;
        this.categoryType = categoryType;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets product name.
     *
     * @return the product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets product name.
     *
     * @param productName the product name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets category type.
     *
     * @return the category type
     */
    public int getCategoryType() {
        return categoryType;
    }

    /**
     * Sets category type.
     *
     * @param categoryType the category type
     */
    public void setCategoryType(int categoryType) {
        this.categoryType = categoryType;
    }
}
