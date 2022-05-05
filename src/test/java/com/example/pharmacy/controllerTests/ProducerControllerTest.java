package com.example.pharmacy.controllerTests;

import com.example.pharmacy.controller.ProducerController;
import com.example.pharmacy.model.Producer;
import com.example.pharmacy.servicelayer.ProducerService;
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
public class ProducerControllerTest {
    @InjectMocks
    ProducerController producerController;
    @Mock
    ProducerService producerService;

    @Test
    public void testGetProducer(){
        Producer producer1 = new Producer("Nuro","0712345","nuro@yahoo.com","Alergetics",1);
        Producer producer2 = new Producer("Alevia","0712345","alevia@yahoo.com","Alergetics",1);

        List<Object> producers = new ArrayList<>();
        producers.add(producer1);
        producers.add(producer2);

        when(producerService.getProducers()).thenReturn(producers);
        assertThat(!producerController.getProducers().get(0).equals(producer2));
        Assertions.assertEquals(producers, producerController.getProducers());
        Assertions.assertEquals(producerController.getProducers().size(), 2);
        producers.add(producer1);
        assertThat(!producerController.getProducers().equals(producers));
    }

}


