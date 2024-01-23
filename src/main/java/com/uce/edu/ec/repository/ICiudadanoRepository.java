package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Ciudadano;

public interface ICiudadanoRepository {

	public Ciudadano seleccionar(Integer id);

	public void insertar(Ciudadano ciudadano);

	public void actualizar(Ciudadano ciudadano);

	public void eliminar(Integer id);

	// Criteria API Query

	public Ciudadano seleccionarPorApellido(String apellido);

	// Funcionalidad que cuando el user sea de pichincha lo busque por nombre
	// cuando sea de cotopaxi lo busque por apellido
	// cuando no sea ni de cotopaxi ni de pichincha lo busque por cedula
	public Ciudadano seleccionarPorCriteria(String nombre, String apellido, String cedula);

	public Ciudadano seleccionarPorCriteriaAndOr(String nombre, String apellido, String cedula);

}
