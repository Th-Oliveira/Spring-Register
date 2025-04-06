package com.thiago.teste_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.thiago.teste_spring.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{}
