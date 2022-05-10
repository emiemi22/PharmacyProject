package com.example.pharmacy.model;
import javax.persistence.*;

@Entity
@Table(name="Torder")
public class Order {

    @Id
    @SequenceGenerator(
            name = "order_seq", sequenceName = "order_seq", allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_sequence"
    )

    private long id;
    private long productId;
    private long producerId;
    private int quantity;

    public Order() {

    }

    public Order(long id, long product_id, long producer_id, int quantity) {
        this.id = id;
        this.producerId = producer_id;
        this.productId = product_id;
        this.quantity = quantity;
    }

    public Order(long product_id, long producer_id, int quantity) {
        this.productId = product_id;
        this.producerId = producer_id;
        this.quantity = quantity;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProduct_id() {
        return productId;
    }

    public void setProduct_id(long product_id) {
        this.productId = product_id;
    }

    public long getProducer_id() {
        return producerId;
    }

    public void setProducer_id(long producer_id) {
        this.producerId = producer_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
