package com.thiago.teste_spring.dtos;

public record UserRequestDTO(
		Long id,
		String name, 
		String login, 
		String password, 
		String email,
		String cep) {

}
