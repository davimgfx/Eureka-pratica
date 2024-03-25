package com.example.clientappb.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("client-app-c")
public interface GetRandomNumberFromC {

    @RequestMapping("/appc/random_number")
    ResponseEntity<Number> randomNumber();
}

