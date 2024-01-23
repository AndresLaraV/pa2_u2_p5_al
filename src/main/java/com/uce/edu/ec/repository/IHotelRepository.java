package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Hotel;

public interface IHotelRepository {
	public Hotel seleccionar(Integer id);

	public void insertar(Hotel hotel);

	public void actualizar(Hotel hotel);

	public void eliminar(Integer id);
	
	// Typed
	public Hotel seleccionarPorNombre(String nombre);

	public Hotel seleccionarPorDireccion(String direccion);

	public Hotel seleccionarPorEstrellas(String estrellas);

	public Hotel seleccionarPorTipo(String tipo);

	public Hotel seleccionarPorCategoria(String categoria);
}
