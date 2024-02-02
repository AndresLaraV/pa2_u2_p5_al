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
	public List<Hotel> seleccionarPorInnerJoin();

	public List<Hotel> seleccionarPorRightJoin();

	public List<Hotel> seleccionarPorLeftJoin();

	public List<Hotel> seleccionarPorFullJoin();
	
	public List<Hotel> seleccionarPorFetchJoin();
}
