package com.uce.edu.ec.service;

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
}
