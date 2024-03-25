package com.example.clientappa.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("client-app-b")
public interface GetRandomNumberFromB {

    @RequestMapping("/appb/random_number")
    ResponseEntity<Number> randomNumber();
}
