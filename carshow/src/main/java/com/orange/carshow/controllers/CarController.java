package com.orange.carshow.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.orange.carshow.services.CarService;
import com.orange.carshow.services.dto.CarRequest;
import com.orange.carshow.services.dto.CardDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/cars")
public class CarController {
    
    private final CarService carService;
    
    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping
    public List<CardDto> getCars() {
        return carService.getCars();
    }
    @PostMapping("/add")
    public CardDto addCar(@RequestBody CardDto car) {
        return carService.addNewCar(car);
    }
    
}
