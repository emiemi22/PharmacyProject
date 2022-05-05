package com.example.pharmacy.serviceTests;
import com.example.pharmacy.model.Producer;
import com.example.pharmacy.repository.ProducerRepo;
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
public class ProducerServiceTest {
    @Mock
    private ProducerRepo producerRepo;
    @InjectMocks
    private ProducerService producerService;

    @Test
    public void testGetProducers() {
        Producer producer1 = new Producer("Nuro", "0712345", "nuro@yahoo.com", "Alergetics", 1);
        Producer producer2 = new Producer("Alevia", "0712345", "alevia@yahoo.com", "Alergetics", 1);

        List<Object> producers = new ArrayList<>();
        producers.add(producer1);
        producers.add(producer2);

        when(producerRepo.getAllElements()).thenReturn(producers);
        assertThat(!producerService.getProducers().get(0).equals(producer2));
        Assertions.assertEquals(producers, producerService.getProducers());
        Assertions.assertEquals(producerService.getProducers().size(), 2);
        producers.add(producer1);
        assertThat(!producerService.getProducers().equals(producers));
    }

    @Test
    public void testProducerValidation() {
        Producer producer1 = new Producer("Nuro", "0712345", "nuro@yahoo.com", "Alergetics", 1);
        Producer producer2 = new Producer("Alevia", "0712345", "alevia@yahoo.com", "Alergetics", 1);
        Producer producer3 = new Producer();
        when(producerRepo.findByName("Alevia")).thenReturn(producer3);
        assertThat(producerService.producerValidation(producer2)).isEqualTo(false);
        assertThat(producerService.producerValidation(producer1)).isEqualTo(true);
    }
}
