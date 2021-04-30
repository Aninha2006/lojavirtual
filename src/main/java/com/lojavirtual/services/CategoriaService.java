package com.lojavirtual.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojavirtual.domain.Categoria;
import com.lojavirtual.repositories.CategoriaRepository;
import com.lojavirtual.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria find(Integer id) {
		Optional<Categoria> categoria = repository.findById(id);
		return categoria.orElseThrow(()-> new ObjectNotFoundException("Categoria não encontrada! Id: " + id + ", tipo: "+ Categoria.class.getName()));
	}
	
	public List<Categoria> findAll(){
		return repository.findAll();
	}
	
	@Transactional
    public Categoria insert(Categoria categoria) {
        categoria.setId(null);
        categoria = repository.save(categoria);
        return categoria;
    }
	
//	public Categoria update(Categoria categoria) {
//		categoria = find(categoria.getId());
//		return repository.save(categoria);
//	}
}
