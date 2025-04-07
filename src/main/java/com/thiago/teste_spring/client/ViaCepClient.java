package com.thiago.teste_spring.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ViaCep", url = "https://viacep.com.br/ws")
public interface ViaCepClient {
	
	@GetMapping("/{cep}/json")
	AdressDTOFeignClient getAdress(@PathVariable String cep);

}
