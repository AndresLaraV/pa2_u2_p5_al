package com.uce.edu.ec.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Ciudadano;

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
public class CiudadanoRepositoryImpl implements ICiudadanoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Ciudadano seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ciudadano.class, id);
	}

	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.entityManager.persist(ciudadano);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.entityManager.merge(ciudadano);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Ciudadano ciud = this.seleccionar(id);
		this.entityManager.remove(ciud);
	}

	@Override
	public Ciudadano seleccionarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		// SELECT c FROM Ciudadano c WHERE c.apellido = :dato

		// 0.- creamos una instancia de la interfaz CriteriaBuilder a partir de un
		// entitymanager
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// 1.- Determinamos el tipo de retorno que va a tener mi consulta
		CriteriaQuery<Ciudadano> myCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);
		// 2.- Construir nuestro SQL
		// 2.1- Determinar el FROM (Root)
		// no necesariamente el FROM es igual al tipo de retorno
		Root<Ciudadano> myFrom = myCriteriaQuery.from(Ciudadano.class);
		// 2.2- Construir las condiciones (WHERE) del sql
		// en criteria api query las condiciones se las conoce como "PREDICATE"
		// c.apellido = :dato
		Predicate condicionApellido = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);
		// 3.- Construimos el SQL final
		myCriteriaQuery.select(myFrom).where(condicionApellido);
		// 4.- ejecutamos la consulta con un typed query
		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();

	}

	@Override
	public Ciudadano seleccionarPorCriteria(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		// Paso 0
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// Paso 1
		CriteriaQuery<Ciudadano> myCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);
		// Paso 2
		Root<Ciudadano> myFrom = myCriteriaQuery.from(Ciudadano.class);
		// Paso 3
		Predicate condicionGenerica = null;

		if (cedula.startsWith("17")) {
			condicionGenerica = myCriteriaBuilder.equal(myFrom.get("nombre"), nombre);
		} else if (cedula.startsWith("05")) {
			condicionGenerica = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);
		} else {
			condicionGenerica = myCriteriaBuilder.equal(myFrom.get("cedula"), cedula);
		}
		myCriteriaQuery.select(myFrom).where(condicionGenerica);

		// Paso 4
		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();

	}

	@Override
	public Ciudadano seleccionarPorCriteriaAndOr(String nombre, String apellido, String cedula) {

		// Paso 0
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// Paso 1
		CriteriaQuery<Ciudadano> myCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);
		// Paso 2
		Root<Ciudadano> myFrom = myCriteriaQuery.from(Ciudadano.class);
		// Paso 3
		Predicate condicionTotal = null;

		Predicate condicionNombre = myCriteriaBuilder.equal(myFrom.get("nombre"), nombre);

		Predicate condicionApellido = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);

		if (cedula.startsWith("17")) {
			condicionTotal = myCriteriaBuilder.or(condicionNombre, condicionApellido);
		} else if (cedula.startsWith("05"))
			condicionTotal = myCriteriaBuilder.and(condicionNombre, condicionApellido);

		myCriteriaQuery.select(myFrom).where(condicionTotal);

		// Paso 4
		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

}
