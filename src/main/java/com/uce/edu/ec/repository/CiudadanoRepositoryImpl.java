package com.uce.edu.ec.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
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

//NATIVE QUERY
	@Override
	public Ciudadano seleccionarPorCedulaCiud(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM ciudadano c WHERE c.ciud_cedula = :cedula",
				Ciudadano.class);
		myQuery.setParameter("cedula", cedula);
		return (Ciudadano) myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorNombreCiud(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery4 = this.entityManager.createNativeQuery("SELECT * FROM ciudadano c WHERE c.ciud_nombre = :nombre",
				Ciudadano.class);
		myQuery4.setParameter("nombre", nombre);
		return (Ciudadano) myQuery4.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorApellidoCiud(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery1 = this.entityManager
				.createNativeQuery("SELECT * FROM ciudadano c WHERE c.ciud_apellido = :apellido", Ciudadano.class);
		myQuery1.setParameter("apellido", apellido);
		return (Ciudadano) myQuery1.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorCodigoDactilar(String codigoDactilar) {
		// TODO Auto-generated method stub
		Query myQuery2 = this.entityManager.createNativeQuery(
				"SELECT * FROM ciudadano c WHERE c.ciud_codigo_dactilar = :codigoDactilar", Ciudadano.class);
		myQuery2.setParameter("codigoDactilar", codigoDactilar);
		return (Ciudadano) myQuery2.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorCiudadOrigenCiud(String ciudadOrigen) {
		// TODO Auto-generated method stub
		Query myQuery3 = this.entityManager.createNativeQuery(
				"SELECT * FROM ciudadano c WHERE c.ciud_ciudad_origen = :ciudadOrigen", Ciudadano.class);
		myQuery3.setParameter("ciudadOrigen", ciudadOrigen);
		return (Ciudadano) myQuery3.getSingleResult();
	}




}
