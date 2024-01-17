package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Empleado;

public interface IEmpleadoRepository {
	public Empleado seleccionar(Integer id);

	public void insertar(Empleado empleado);

	public void actualizar(Empleado empleado);

	public void eliminar(Integer id);
	
	
	//public Empleado seleccionarCPorCedula(String cedula);
		
	
}
