package br.com.orangetalents.carmanager.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.orangetalents.carmanager.dto.UserDTO;
import br.com.orangetalents.carmanager.services.UserService;
 
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService; 

    @PostMapping // JAKARTA BEAN VALIDATION
    public ResponseEntity<?> createUser(
        @Valid 
        @RequestBody UserDTO userDTO ){
            
            return userService.create(userDTO);
    }   

    @GetMapping("/{id}/car")
    public ResponseEntity<?> findUserCarsById(@PathVariable Long id){
        return userService.findUserCarsById(id);
    }
 }