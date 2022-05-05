package com.example.pharmacy.repositoryTests;

import com.example.pharmacy.model.Producer;
import com.example.pharmacy.repository.ProducerRepo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProducerRepoTest {
    @Mock
    ProducerRepo producerRepo;

    @Test
    public void getAllElementsTest() {
        Producer producer1 = new Producer("Nuro", "0712345", "nuro@yahoo.com", "Alergetics", 1);
        Producer producer2 = new Producer("Alevia", "0712345", "alevia@yahoo.com", "Alergetics", 1);
        Producer producer3 = new Producer("Alevi2a", "0712345", "alevia@yahoo.com", "Alergetics", 1);
        List<Object> producers = new ArrayList<>();
        producers.add(producer1);
        producers.add(producer2);
        when(producerRepo.getAllElements()).thenReturn(producers);
        Assertions.assertEquals(producers, producerRepo.getAllElements());
        assertThat(producerRepo.getAllElements().size()).isEqualTo(2);
        producers.add(producer3);
        assertThat(producerRepo.getAllElements().size()).isNotEqualTo(producers);
    }

    @Test
    public void findByNameTest() {
        Producer producer1 = new Producer("Nuro", "0712345", "nuro@yahoo.com", "Alergetics", 1);
        Producer producer2 = new Producer("Alevia", "0712345", "alevia@yahoo.com", "Alergetics", 1);
        when(producerRepo.findByName("Nuro")).thenReturn(producer1);
        assertThat(producerRepo.findByName("Nuro")).isEqualTo(producer1);
        assertThat(producerRepo.findByName("Alevia")).isNotEqualTo(producer1);
    }

    @Test
    public void findByIdTest() {
        Producer producer1 = new Producer("Nuro", "0712345", "nuro@yahoo.com", "Alergetics", 1);
        Producer producer2 = new Producer("Alevia", "0712345", "alevia@yahoo.com", "Alergetics", 1);
        when(producerRepo.findById(1L)).thenReturn(producer1);
        assertThat(producerRepo.findById(1L)).isEqualTo(producer1);
        assertThat(producerRepo.findById(2L)).isNotEqualTo(producer1);

    }
}
