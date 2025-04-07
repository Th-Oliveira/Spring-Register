package com.thiago.teste_spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.thiago.teste_spring.client.AdressDTOFeignClient;
import com.thiago.teste_spring.client.ViaCepClient;
import com.thiago.teste_spring.dtos.UserAdressResponseDTO;
import com.thiago.teste_spring.entity.UserEntity;
import com.thiago.teste_spring.repository.UserRepository;

@Service
public class ViaCepService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ViaCepClient viaCepClient;
	
	public UserAdressResponseDTO getUserWithAdress(Long id) {
		UserEntity user = this.userRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Usuário com ID " + id + "não encontrado!"));
		
		AdressDTOFeignClient adress = viaCepClient.getAdress(user.getCep());
		
		return new UserAdressResponseDTO(
				user.getName(),
			    user.getLogin(),
			    user.getEmail(),
			    adress.cep(),
			    adress.logradouro(),
			    adress.bairro(),
			    adress.localidade(),
			    adress.uf(),
			    adress.estado(),
			    adress.ddd()
			    );
	}
}