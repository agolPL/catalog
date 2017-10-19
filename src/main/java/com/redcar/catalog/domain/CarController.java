package com.redcar.catalog.domain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
class CarController {

    @GetMapping
    List<Car> getCars() {
        return Arrays.asList(new Car("BMW"), new Car("Volvo"));
    }
}
