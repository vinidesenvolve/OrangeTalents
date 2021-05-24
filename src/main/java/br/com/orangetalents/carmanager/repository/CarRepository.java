package br.com.orangetalents.carmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.orangetalents.carmanager.model.Car;

public interface CarRepository extends JpaRepository<Car, Long>{
   
} 
