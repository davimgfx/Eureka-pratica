package com.example.clientappa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ClientAppAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientAppAApplication.class, args);
	}

}
