package com.uce.edu.ec.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutorRepositoryImpl implements IAutorRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Autor seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Autor autor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
