package com.uce.edu.ec.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepositoryImpl implements IEmpleadoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Empleado seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empleado.class, id);
	}

	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.merge(empleado);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Empleado emple = this.seleccionar(id);
		this.entityManager.remove(emple);
	}

	/*@Override
	public Empleado seleccionarCPorCedula(String cedula) {
		TypedQuery<Empleado> myQuery = this.entityManager.createQuery("SELECT e From Empleado e WHERE e.ciudadano.cedula = :cedula", Empleado.class);
		myQuery.setParameter("cedula", cedula);
		return myQuery.getSingleResult();
	}*/

}
