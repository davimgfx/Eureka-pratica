package com.example.clientappa.controller;

import com.example.clientappa.client.GetRandomNumberFromB;
import feign.FeignException;
import org.springframework.http.HttpStatus;
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
        try {
            ResponseEntity<Number> responseFromB = getRandomNumberFromB.randomNumber();

            if (responseFromB.getStatusCode() == HttpStatus.OK) {
                Number numberFromB = responseFromB.getBody();
                // Aqui você pode adicionar a lógica que deseja aplicar ao número recebido do serviço B
                // Por exemplo, somar um número aleatório
                return ResponseEntity.ok(numberFromB);
            } else {
                // Se a chamada para o endpoint falhar, retorna -2
                return ResponseEntity.ok(-1);
            }
        } catch (FeignException e) {
            // Se ocorrer uma exceção ao chamar o endpoint, retorna -2
            return ResponseEntity.ok(-1);
        }
    }
}
