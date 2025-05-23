package com.thiago.teste_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TesteSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteSpringApplication.class, args);
	}

}
