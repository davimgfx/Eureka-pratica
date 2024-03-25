package com.example.clientappc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Random;

@Controller
@RequestMapping("/appc")
public class TestController {
    
    @GetMapping("/random_number")
    public ResponseEntity<Number> getTestResponse() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10);
        return new ResponseEntity(numeroAleatorio, HttpStatus.OK);
    }

}