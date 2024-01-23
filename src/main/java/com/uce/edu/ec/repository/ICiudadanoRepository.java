package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Ciudadano;

public interface ICiudadanoRepository {

	public Ciudadano seleccionar(Integer id);

	public void insertar(Ciudadano ciudadano);

	public void actualizar(Ciudadano ciudadano);

	public void eliminar(Integer id);

	// Native
	public Ciudadano seleccionarPorCedulaCiud(String cedula);

	public Ciudadano seleccionarPorNombreCiud(String nombre);

	public Ciudadano seleccionarPorApellidoCiud(String apellido);

	public Ciudadano seleccionarPorCodigoDactilar(String codigoDactilar);

	public Ciudadano seleccionarPorCiudadOrigenCiud(String ciudadOrigen);


}
