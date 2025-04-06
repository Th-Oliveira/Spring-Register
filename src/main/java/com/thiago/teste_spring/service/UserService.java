package com.thiago.teste_spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.teste_spring.dtos.UserPasswordResponseDTO;
import com.thiago.teste_spring.dtos.UserResponseDTO;
import com.thiago.teste_spring.entity.UserEntity;
import com.thiago.teste_spring.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<UserResponseDTO> listAllUsers(){		 
		return userRepository.findAll()
				.stream()
				.map(u -> new UserResponseDTO(u.getName(), u.getLogin(), u.getEmail()))
				.toList();
	}
	
	public UserEntity getUserById(Long id){
		return this.userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário com ID " + id + " não encontrado!"));
	}
	
	public UserEntity registerUser(UserPasswordResponseDTO dto) {
		 UserEntity user = new UserEntity(dto.name(), dto.login(), dto.password(), dto.email());
		 return this.userRepository.save(user);
	}
	
	public void deleteAllUsers() {
		userRepository.deleteAll();
	}
	
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
		
	}
}