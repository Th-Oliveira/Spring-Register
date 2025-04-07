package com.thiago.teste_spring.dtos;

public record UserPasswordResponseDTO(
		String name, 
		String login, 
		String password, 
		String email,
		String cep) {

}
