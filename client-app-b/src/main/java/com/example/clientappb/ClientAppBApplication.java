package com.example.clientappb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ClientAppBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientAppBApplication.class, args);
	}

}
