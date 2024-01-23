package com.uce.edu.ec.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepositoryImpl implements IHotelRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Hotel seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Hotel.class, id);
	}

	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.merge(hotel);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(id);
	}

	// Typed Query
	@Override
	public Hotel seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery("select h from Hotel h Where h.nombre = :nombre",
				Hotel.class);
		myQuery.setParameter("nombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public Hotel seleccionarPorDireccion(String direccion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager
				.createQuery("select h from Hotel h Where h.direccion = :direccion", Hotel.class);
		myQuery.setParameter("direccion", direccion);
		return myQuery.getSingleResult();
	}

	@Override
	public Hotel seleccionarPorEstrellas(String estrellas) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager
				.createQuery("select h from Hotel h Where h.estrellas = :estrellas", Hotel.class);
		myQuery.setParameter("estrellas", estrellas);
		return myQuery.getSingleResult();
	}

	@Override
	public Hotel seleccionarPorTipo(String tipo) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery("select h from Hotel h Where h.tipo = :tipo",
				Hotel.class);
		myQuery.setParameter("tipo", tipo);
		return myQuery.getSingleResult();
	}

	@Override
	public Hotel seleccionarPorCategoria(String categoria) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager
				.createQuery("select h from Hotel h Where h.categoria = :categoria", Hotel.class);
		myQuery.setParameter("categoria", categoria);
		return myQuery.getSingleResult();
	}

}
