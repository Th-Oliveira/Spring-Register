package com.thiago.teste_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiago.teste_spring.dtos.UserAdressResponseDTO;
import com.thiago.teste_spring.service.ViaCepService;

@RestController
@RequestMapping("/users")
public class ViaCepController {
	
	@Autowired
	private ViaCepService viaCepService;
	
	@GetMapping
	public ResponseEntity<List<UserAdressResponseDTO>> listAllUsersViaCep() {
		return ResponseEntity.ok(this.viaCepService.getAllUserWithAdress());
	}
	
	@GetMapping("/{id}/ViaCep")
	public ResponseEntity<UserAdressResponseDTO> listAllUsersViaCepById(@PathVariable Long id){
		return ResponseEntity.ok(this.viaCepService.getUserWithAdressById(id));
	}

}
