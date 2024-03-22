package com.example.clientappa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Random;

@Controller
@RequestMapping("/first")
public class TestController {
    
    @GetMapping("/test")
    public ResponseEntity<String> getTestResponse() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(11);
        return new ResponseEntity(numeroAleatorio, HttpStatus.OK);
    }

}