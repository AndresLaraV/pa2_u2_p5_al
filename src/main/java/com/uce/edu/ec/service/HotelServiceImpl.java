package com.uce.edu.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.repository.IHotelRepository;
import com.uce.edu.ec.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {
	@Autowired
	IHotelRepository hotelRepository;

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionar(id);
	}

	@Override
	public void guardar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.insertar(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.actualizar(hotel);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepository.eliminar(id);
	}
	//Typed Query
	
	@Override
	public Hotel buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorNombre(nombre);
	}

	@Override
	public Hotel buscarPorDireccion(String direccion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorDireccion(direccion);
	}

	@Override
	public Hotel buscarPorEstrellas(String estrellas) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorEstrellas(estrellas);
	}

	@Override
	public Hotel buscarPorTipo(String tipo) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorTipo(tipo);
	}

	@Override
	public Hotel buscarPorCategoria(String categoria) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorCategoria(categoria);
	}

}
