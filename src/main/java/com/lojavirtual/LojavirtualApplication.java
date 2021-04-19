package com.lojavirtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import domain.Categoria;

@SpringBootApplication
public class LojavirtualApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojavirtualApplication.class, args);
		
		
		
		System.out.println(" BANCO RODANDO ");
		
		
		
		Categoria cat1 = new Categoria (1, " Camiseta ");
		
		Categoria cat2 = new Categoria (2, " Calça ");
		
		System.out.println(" Categoria 1: " + cat1.getNome() + " \n Categoria 2: " + cat2.getNome());
		
		
		
		
		
	}

}
