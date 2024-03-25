package com.example.clientappa.controller;

import com.example.clientappa.client.GetRandomNumberFromB;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/appa")
public class TestController {
    
    @Autowired
    GetRandomNumberFromB getRandomNumberFromB;

    @GetMapping("/random_number")
    public ResponseEntity<Number> getNumberResponse() {
        return getRandomNumberFromB.randomNumber();
    }

}