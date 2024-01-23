package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Ciudadano;

public interface ICiudadanoService {
	public Ciudadano buscar(Integer id);

	public void guardar(Ciudadano ciudadano);

	public void actualizar(Ciudadano ciudadano);

	public void borrar(Integer id);

	// Criteria Query

	public Ciudadano buscarPorApellido(String apellido);

	public Ciudadano buscarPorCriteria(String nombre, String apellido, String cedula);

	public Ciudadano buscarPorCriteriaAndOr(String nombre, String apellido, String cedula);

}
