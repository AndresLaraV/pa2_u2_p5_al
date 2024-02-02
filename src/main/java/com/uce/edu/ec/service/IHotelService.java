package com.uce.edu.ec.service;

import java.util.List;

import com.uce.edu.ec.repository.modelo.Hotel;

public interface IHotelService {
	public Hotel buscar(Integer id);

	public void guardar(Hotel hotel);

	public void actualizar(Hotel hotel);

	public void borrar(Integer id);
	
	//Typed 
	public Hotel buscarPorCriteriaNombre (String nombre);

	public Hotel buscarPorCriteriaDireccion(String direccion);

	public Hotel buscarPorCriteriaEstrellas (String estrellas);

	public Hotel buscarPorCriteriaTipo(String tipo);

	public Hotel buscarPorCriteriaCategoria (String categoria);
	
	//JOIN TYPES
	
	public List<Hotel> buscarPorInnerJoin();

	public List<Hotel> buscarPorRightJoin();

	public List<Hotel> buscarPorLeftJoin();

	public List<Hotel> buscarPorFullJoin();
	
	public List<Hotel> buscarPorFetchJoin();
}
