package com.lojavirtual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojavirtual.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}