package com.thiago.teste_spring.client;

public record AdressDTOFeignClient(
	    String cep,
	    String logradouro,
	    String bairro,
	    String localidade,
	    String uf,
	    String estado,
	    int ddd) {

}
