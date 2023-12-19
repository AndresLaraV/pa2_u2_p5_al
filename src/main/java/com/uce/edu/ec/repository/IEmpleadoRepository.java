package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Empleado;

public interface IEmpleadoRepository {
	public Empleado seleccionar(Integer id);

	public void insertar(Empleado empleado);
}
