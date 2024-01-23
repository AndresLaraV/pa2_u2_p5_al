package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Hotel;

public interface IHotelService {
	public Hotel buscar(Integer id);

	public void guardar(Hotel hotel);

	public void actualizar(Hotel hotel);

	public void borrar(Integer id);
	
	//Typed 
	public Hotel buscarPorNombre (String nombre);

	public Hotel buscarPorDireccion(String direccion);

	public Hotel buscarPorEstrellas (String estrellas);

	public Hotel buscarPorTipo(String tipo);

	public Hotel buscarPorCategoria (String categoria);
}
