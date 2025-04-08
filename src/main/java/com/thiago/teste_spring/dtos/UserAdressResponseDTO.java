package com.thiago.teste_spring.dtos;

import com.thiago.teste_spring.client.AdressDTOFeignClient;
import com.thiago.teste_spring.entity.UserEntity;

public record UserAdressResponseDTO(
		Long id,
		String name,
	    String login,
	    String email,
	    String cep,
	    String logradouro,
	    String bairro,
	    String localidade,
	    String uf,
	    String estado,
	    int ddd) {
	
	public UserAdressResponseDTO(UserEntity user, AdressDTOFeignClient adress) {
		this(
				user.getId(),
				user.getName(),
				user.getLogin(),
				user.getEmail(),
				adress.cep(),
				adress.logradouro(),
				adress.bairro(),
				adress.localidade(),
				adress.uf(),
				adress.estado(),
				adress.ddd());
	}

}