package com.example.pharmacy.servicelayer;

import com.example.pharmacy.model.Producer;
import com.example.pharmacy.model.Product;
import com.example.pharmacy.repository.ProducerRepo;
import com.example.pharmacy.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerService {
    private final Repository producerRepository;

    @Autowired
    public ProducerService(ProducerRepo producerRepository) {
        this.producerRepository = producerRepository;
    }

    public List<Object> getProducers() {
        return producerRepository.getAllElements();
    }

    public boolean producerValidation(Producer producer) {
        Producer p = (Producer) producerRepository.findByName(producer.getProducerName());
        if (p == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addNewProducer(Producer producer) {
        if(producerValidation(producer)){
            producerRepository.addElement(producer);
        }
        else{
            throw new IllegalStateException("product already in DB");
        }
    }

    public void deleteProducer(Long id) {
        Producer producer = (Producer) producerRepository.findById(id);
        if(producer != null){
            producerRepository.deleteElement(producer);

        }
        else{
            throw new IllegalStateException("producer is not in DB");
        }
    }
}
