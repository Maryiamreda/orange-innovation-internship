package com.orange.carshow.Services;
import com.orange.carshow.services.dto.CardDto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.orange.carshow.controllers.CarController;
import com.orange.carshow.services.CarService;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


//Mockito allows you to create mock objects,
// define their behavior, and verify interactions.

// use Mockito’s @Mock annotation
// @InjectMocks annotation to inject the mocks into the class under test:


public class GetByIdTest {

    @Test
    void when_GetById_ThenSuccess() {
        // mock CarService
        CarService carService = Mockito.mock(CarService.class);


        CarController controller = new CarController(carService);

        when(carService.getCars()).thenReturn(List.of(car));

        // act
        ResponseEntity<CardDto> response = controller.getCarById(123L);

        // assert
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(car, response.getBody());
    }


}
