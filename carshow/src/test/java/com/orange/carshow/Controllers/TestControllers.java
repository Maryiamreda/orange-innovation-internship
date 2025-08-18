package com.orange.carshow.Controllers;

import com.orange.carshow.services.dto.CardDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


// Use the @SpringBootTest annotation to load the entire application context
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestControllers {
    @Autowired
    TestRestTemplate restTemplate;


    @Test
    void whenGetCarById_thenReturnCar() {
        // when
        var response = restTemplate.getForEntity("/cars/{id}", CardDto.class, 457);

        // then
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(457L, response.getBody().getModel().getId());
    }
}
