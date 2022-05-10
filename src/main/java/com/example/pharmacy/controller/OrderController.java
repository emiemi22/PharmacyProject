package com.example.pharmacy.controller;

import com.example.pharmacy.model.Order;
import com.example.pharmacy.servicelayer.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Torder")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Object> getOrders() {
        return orderService.getOrders();
    }

    @PostMapping
    public void addNewOrder(@RequestBody Order order) {
        orderService.addNewOrder(order);
    }

    @DeleteMapping(path = "{id}")
    public void deleteOrder(@PathVariable("id") Long id) {
        orderService.deleteOrder(id);
    }
    @PutMapping(path ="{id}")
    public void updateOrder(@RequestBody Order order, @PathVariable Long id){

    }
}
