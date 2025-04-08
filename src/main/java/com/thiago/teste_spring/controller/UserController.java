package com.thiago.teste_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiago.teste_spring.dtos.UserAdressResponseDTO;
import com.thiago.teste_spring.dtos.UserRequestDTO;
import com.thiago.teste_spring.dtos.UserResponseDTO;
import com.thiago.teste_spring.entity.UserEntity;
import com.thiago.teste_spring.service.UserService;
import com.thiago.teste_spring.service.ViaCepService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ViaCepService viaCepService;
	
	@GetMapping
	public ResponseEntity<List<UserResponseDTO>> listAllUsers(){
		return ResponseEntity.ok(this.userService.listAllUsers());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserEntity> listUserById(@PathVariable Long id){
		UserEntity userEntityId = userService.getUserById(id);
		return ResponseEntity.ok(userEntityId);
	}
	
	@PostMapping
	public ResponseEntity<UserEntity> registerUser(@RequestBody UserRequestDTO user){
		return ResponseEntity.ok(this.userService.registerUser(user));
	}
	
	@DeleteMapping
	public ResponseEntity<Void> deleteAllUsers(){
		this.userService.deleteAllUsers();
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteUserById(@PathVariable Long id){
		this.userService.deleteUserById(id);
		return ResponseEntity.noContent().build();
	}
}