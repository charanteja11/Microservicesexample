package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Microservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservice2Application.class, args);
		
		RestTemplate rt = new RestTemplate();
		Class2 c = rt.getForObject("http://localhost:8080/", Class2.class);
		System.out.println(c.getName());
	}
	
}
