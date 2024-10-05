package com.turkcell.TurkcellCRM.searchService.business.concretes;

import com.turkcell.TurkcellCRM.searchService.entities.IndividualCustomer;
import com.turkcell.TurkcellCRM.searchService.kafka.IndividualCustomerConsumer;
import com.turkcell.TurkcellCRM.searchService.repositories.SearchRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.kafka.core.KafkaTemplate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class SearchManagerTest {
    private SearchManager searchManager;
    private SearchRepository searchRepository;

    private KafkaTemplate kafkaTemplate;


    @BeforeEach
    void setUp(){
        searchRepository = mock(SearchRepository.class);
        kafkaTemplate = mock(KafkaTemplate.class);
        IndividualCustomerConsumer consumer = new IndividualCustomerConsumer(searchManager);
        searchManager = new SearchManager(searchRepository);

    }
    @Test
    void add(){
        IndividualCustomer customer = new IndividualCustomer();

        customer.setBirthDate(LocalDateTime.now());
        customer.setNationalityNumber("12345678902");
        customer.setFirstName("Deneme");
        customer.setLastName("Deneme");
        customer.setGender("MALE");
        customer.setFatherName("Deneme");
        customer.setMotherName("Deneme");
        searchRepository.save(customer);

    }

    @Test
    void getAll() {
        IndividualCustomer customer1 = new IndividualCustomer();
        IndividualCustomer customer2 = new IndividualCustomer();
        List<IndividualCustomer> list = new ArrayList<>();

        list.add(customer1);
        list.add(customer2);
        when(searchRepository.findAll()).thenReturn(list);
        assertEquals(2, list.size());

    }

}
