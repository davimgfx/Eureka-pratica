package com.example.clientappc.controller;

import com.example.clientappc.client.GetRandomNumberFromB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/appc")
public class TestController {

    @Autowired
    GetRandomNumberFromB getRandomNumberFromB;

    @GetMapping("/random_number")
    public ResponseEntity<Number> getNumberResponse() {
        return getRandomNumberFromB.randomNumber();
    }
}


