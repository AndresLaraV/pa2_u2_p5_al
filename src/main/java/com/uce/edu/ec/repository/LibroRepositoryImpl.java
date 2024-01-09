package com.uce.edu.ec.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.repository.modelo.Libro2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LibroRepositoryImpl implements ILibroRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Libro seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Libro.class, id);
	}

	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}

	@Override
	public void insertar(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro2);
	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(libro);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(id);
	}

	@Override
	public Libro seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		// SQL: Select * FROM libro l WHERE l.libr_titulo= ?
		// JPQL: SELECT l FROM Libro l WHERE l.titulo = :variable AND l.fecha =: variable2
		Query myQuery = this.entityManager.createQuery("SELECT l FROM Libro l WHERE l.titulo = :variable");
		myQuery.setParameter("variable", nombre);
		return (Libro) myQuery.getSingleResult();
		//GetSingleResult nos va a dar una sola respuesta o un único resultado 
	}

}
