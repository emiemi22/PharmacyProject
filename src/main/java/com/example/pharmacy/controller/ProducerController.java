package com.example.pharmacy.controller;

import com.example.pharmacy.model.Producer;
import com.example.pharmacy.servicelayer.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Producer controller.
 */
@RestController
@RequestMapping("api/v1/producer")
public class ProducerController {
    private final ProducerService producerService;

    /**
     * Instantiates a new Producer controller.
     *
     * @param producerService the producer service
     */
    @Autowired
    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    /**
     * Gets producers.
     *
     * @return the producers
     */
    @GetMapping
    public List<Object> getProducers() {
        return producerService.getProducers();
    }

    /**
     * Add new producer.
     *
     * @param producer the producer
     */
    @PostMapping
    public void addNewProducer(@RequestBody Producer producer) {
        producerService.addNewProducer(producer);
    }

    /**
     * Delete producer.
     *
     * @param id the id
     */
    @DeleteMapping(path = "{id_producer}")
    public void deleteProducer(@PathVariable("id_producer") Long id) {
        producerService.deleteProducer(id);
    }

}
