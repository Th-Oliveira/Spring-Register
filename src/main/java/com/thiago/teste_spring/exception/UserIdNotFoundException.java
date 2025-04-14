package com.thiago.teste_spring.exception;

public class UserIdNotFoundException extends RuntimeException{	
	
	public UserIdNotFoundException(Long id) {
		super("Usuário com ID " + id + " não encontrado!");
	}
}