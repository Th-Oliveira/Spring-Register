package com.thiago.teste_spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_users")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name="login", unique = true, nullable = false)
	private String login;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="cep", nullable = false)
	private String cep;

	public UserEntity() {}

	public UserEntity(String name, String login, String email, String cep) {
		this.name = name;
		this.login = login;
		this.email = email;
		this.cep = cep;
	}	

	public UserEntity(String name, String login, String password, String email, String cep) {
		this.name = name;
		this.login = login;
		this.password = password;
		this.email = email;
		this.cep = cep;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}	
}