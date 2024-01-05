package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Habitacion;

public interface IHabitacionService {
	public Habitacion buscar(Integer id);

	public void guardar(Habitacion habitacion);

	public void actualizar(Habitacion habitacion);

	public void borrar(Integer id);
}
