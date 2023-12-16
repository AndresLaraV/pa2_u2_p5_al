package com.uce.edu.service;

import org.springframework.stereotype.Service;

import com.uce.edu.repository.modelo.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class IAlumnoServiceImpl implements IAlumnoService {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Alumno buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Alumno.class, id);
	}

	@Override
	public void guardar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.entityManager.persist(alumno);
	}

	@Override
	public void actualizar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.entityManager.merge(alumno);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		Alumno alum = this.buscar(id);
		this.entityManager.remove(alum);
	}

}
