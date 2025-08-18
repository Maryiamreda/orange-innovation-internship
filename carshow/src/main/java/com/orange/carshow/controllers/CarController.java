package com.orange.carshow.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.orange.carshow.services.CarService;
import com.orange.carshow.services.dto.CarRequest;
import com.orange.carshow.services.dto.CardDto;


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

    @GetMapping("/expensive")
    public CardDto getExpensiveCar() {
        return carService.getExpensiveCar();
    }


    @GetMapping("/{id}")
    public ResponseEntity<CardDto> getCarById(@PathVariable Long id) {
        return carService.getCars().stream()
                .filter(car -> car.getModelID()== id)
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }




    @GetMapping("/name")
    public List<CardDto> getCarsByModelName(@PathVariable String modelName) {
        return carService.getCarsByModelName(modelName);
    }


    @PostMapping("/add")
    public CardDto addCar(@RequestBody CardDto car) {
        return carService.addNewCar(car);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> removeCar(@PathVariable Long id) {
        boolean deleted = carService.deleteCar(id);
        return deleted ?
                ResponseEntity.ok("Car deleted successfully") :
                ResponseEntity.notFound().build();
    }
}
