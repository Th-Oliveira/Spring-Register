package com.thiago.teste_spring.dtos;

public record UserResponseDTO(
		Long id,
		String name, 
		String login, 
		String email,
		String cep
	    ) {
	
}
