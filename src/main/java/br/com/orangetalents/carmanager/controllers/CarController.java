package br.com.orangetalents.carmanager.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.orangetalents.carmanager.dto.CarDTO;
import br.com.orangetalents.carmanager.services.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
 
    @Autowired
    public CarService carService;
    
    @PostMapping("/{userId}")
    public ResponseEntity<?> createCar(
        @Valid
        @RequestBody CarDTO carDTO, 
        @PathVariable Long userId){

            return carService.create(carDTO, userId);
    }
}
