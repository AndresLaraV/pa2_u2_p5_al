package com.uce.edu.ec.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
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

	// Criteria APi Query
	@Override
	public Hotel seleccionarPorCriteriaNombre(String nombre) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Hotel> myCriteriaQuery = myCriteriaBuilder.createQuery(Hotel.class);

		Root<Hotel> myFrom = myCriteriaQuery.from(Hotel.class);

		Predicate condicionNombre = myCriteriaBuilder.equal(myFrom.get("nombre"), nombre);

		myCriteriaQuery.select(myFrom).where(condicionNombre);

		TypedQuery<Hotel> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Hotel seleccionarPorCriteriaDireccion(String direccion) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Hotel> myCriteriaQuery = myCriteriaBuilder.createQuery(Hotel.class);

		Root<Hotel> myFrom = myCriteriaQuery.from(Hotel.class);

		Predicate condicionDireccion = myCriteriaBuilder.equal(myFrom.get("direccion"), direccion);

		myCriteriaQuery.select(myFrom).where(condicionDireccion);

		TypedQuery<Hotel> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Hotel seleccionarPorCriteriaEstrellas(String estrellas) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Hotel> myCriteriaQuery = myCriteriaBuilder.createQuery(Hotel.class);

		Root<Hotel> myFrom = myCriteriaQuery.from(Hotel.class);

		Predicate condicionEstrellas = myCriteriaBuilder.equal(myFrom.get("estrellas"), estrellas);

		myCriteriaQuery.select(myFrom).where(condicionEstrellas);

		TypedQuery<Hotel> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Hotel seleccionarPorCriteriaTipo(String tipo) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Hotel> myCriteriaQuery = myCriteriaBuilder.createQuery(Hotel.class);

		Root<Hotel> myFrom = myCriteriaQuery.from(Hotel.class);

		Predicate condicionTipo = myCriteriaBuilder.equal(myFrom.get("tipo"), tipo);

		myCriteriaQuery.select(myFrom).where(condicionTipo);

		TypedQuery<Hotel> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Hotel seleccionarPorCriteriaCategoria(String categoria) {
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Hotel> myCriteriaQuery = myCriteriaBuilder.createQuery(Hotel.class);

		Root<Hotel> myFrom = myCriteriaQuery.from(Hotel.class);

		Predicate condicionCategoria = myCriteriaBuilder.equal(myFrom.get("categoria"), categoria);

		myCriteriaQuery.select(myFrom).where(condicionCategoria);

		TypedQuery<Hotel> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

}
