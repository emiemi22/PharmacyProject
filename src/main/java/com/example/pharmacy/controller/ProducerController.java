package com.example.pharmacy.controller;

import com.example.pharmacy.model.Producer;
import com.example.pharmacy.servicelayer.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/producer")
public class ProducerController {
    private final ProducerService producerService;

    @Autowired
    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping
    public List<Object> getProducers() {
        return producerService.getProducers();
    }

    @PostMapping
    public void addNewProducer(@RequestBody Producer producer) {
        producerService.addNewProducer(producer);
    }

    @DeleteMapping(path = "{id_producer}")
    public void deleteProducer(@PathVariable("id_producer") Long id) {
        producerService.deleteProducer(id);
    }

}
