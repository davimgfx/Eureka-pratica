package com.example.clientappb.controller;

import com.example.clientappb.client.GetRandomNumberFromC;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

@Controller
@RequestMapping("/appb")
public class TestController {

    @Autowired
    GetRandomNumberFromC getRandomNumberFromC;

      @GetMapping("/random_number")
        public ResponseEntity<Number> getNumberResponse() {
      
        ResponseEntity<Number> responseFromC = getRandomNumberFromC.randomNumber();
        Number numberFromC = responseFromC.getBody();

     
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 10;

        int sum = randomNumber + numberFromC.intValue();

        return ResponseEntity.ok(sum);
    }
}