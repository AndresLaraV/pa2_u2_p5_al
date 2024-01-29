package com.uce.edu.ec.repository;

import java.util.List;

import com.uce.edu.ec.repository.modelo.Hotel;

public interface IHotelRepository {
	public Hotel seleccionar(Integer id);

	public void insertar(Hotel hotel);

	public void actualizar(Hotel hotel);

	public void eliminar(Integer id);
	
	// Criteria API Query
	
	public Hotel seleccionarPorCriteriaNombre(String estrellas);

	public Hotel seleccionarPorCriteriaDireccion(String direccion);

	public Hotel seleccionarPorCriteriaEstrellas(String estrellas);

	public Hotel seleccionarPorCriteriaTipo(String tipo);

	public Hotel seleccionarPorCriteriaCategoria(String categoria);
	
	//JOIN TYPES
	public List<Hotel> seleccionarPorInnerJoin(String categoria);

	public List<Hotel> seleccionarPorRightJoin(String direccion);

	public List<Hotel> seleccionarPorLeftJoin(String estrellas);

	public List<Hotel> seleccionarPorFullJoin(String estrellas);
}
