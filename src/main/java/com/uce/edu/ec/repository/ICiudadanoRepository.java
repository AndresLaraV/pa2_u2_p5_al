package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Ciudadano;
import com.uce.edu.ec.repository.modelo.Empleado;

public interface ICiudadanoRepository {

	public Ciudadano seleccionar(Integer id);

	public void insertar(Ciudadano ciudadano);
	
	public void actualizar(Ciudadano ciudadano);

	public void eliminar(Integer id);
	
	public Empleado seleccionarPorCedula (String cedula);
	
	public Ciudadano seleccionarPorCedulaCiud (String cedula);
}
