package com.example.clientappb.controller;

import com.example.clientappb.client.GetRandomNumberFromC;
import feign.FeignException;
import org.springframework.http.HttpStatus;
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
        try {
            ResponseEntity<Number> responseFromC = getRandomNumberFromC.randomNumber();

            if (responseFromC.getStatusCode() == HttpStatus.OK) {
                Number numberFromC = responseFromC.getBody();
                Random random = new Random();
                int randomNumber = random.nextInt(10) + 10;
                int sum = randomNumber + numberFromC.intValue();
                return ResponseEntity.ok(sum);
            } else {
                // Se a chamada para o endpoint falhar, retorna -1
                return ResponseEntity.ok(-2);
            }
        } catch (FeignException e) {
            // Se ocorrer uma exceção ao chamar o endpoint, retorna -1
            return ResponseEntity.ok(-2);
        }
    }
}
