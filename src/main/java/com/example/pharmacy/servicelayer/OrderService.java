package com.example.pharmacy.servicelayer;

import com.example.pharmacy.model.Order;
import com.example.pharmacy.model.Producer;
import com.example.pharmacy.model.Product;
import com.example.pharmacy.repository.OrderRepo;
import com.example.pharmacy.repository.ProducerRepo;
import com.example.pharmacy.repository.ProductRepo;
import com.example.pharmacy.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final Repository orderRepository;
    private final Repository productRepository;
    private final Repository producerRepository;
    @Autowired
    public OrderService(OrderRepo orderRepo, ProductRepo productRepository, ProducerRepo producerRepository){
        this.orderRepository = orderRepo;
        this.productRepository = productRepository;
        this.producerRepository = producerRepository;
    }
    public List<Object> getOrders(){
        return orderRepository.getAllElements();
    }
    public void addNewOrder(Order order){
        int quantity = order.getQuantity();
        long idProduct = order.getProduct_id();
        long idProducer = order.getProducer_id();
        Product product =(Product) productRepository.findById(idProduct);
        Producer producer = (Producer) producerRepository.findById(idProducer);
        if(product == null){
            throw new IllegalStateException("There is no product with this id");
        }
        else{
            product.setStock(product.getStock() + quantity);
            productRepository.updateElement(idProduct,product);
        }
        if(producer == null){
            throw new IllegalStateException("There is no producer with this id");
        }
        orderRepository.addElement(order);
    }
    public void deleteOrder(Long id){
        Order order = (Order)orderRepository.findById(id);
        if (order == null){
            throw new IllegalStateException("This order is not in DB");
        }
        else
        {
            orderRepository.deleteElement(order);
            Product product =(Product) productRepository.findById(order.getProduct_id());
            product.setStock(product.getStock() - order.getQuantity());
            productRepository.updateElement(order.getProduct_id(), product);
        }
    }
    public void updateOrder(Long id, Order order){

    }
}
