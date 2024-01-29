package com.uce.edu.ec.service;

import java.util.List;

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
	//Criteria API Query

	@Override
	public Hotel buscarPorCriteriaNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorCriteriaNombre(nombre);
	}

	@Override
	public Hotel buscarPorCriteriaDireccion(String direccion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorCriteriaDireccion(direccion);
	}

	@Override
	public Hotel buscarPorCriteriaEstrellas(String estrellas) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorCriteriaEstrellas(estrellas);
	}

	@Override
	public Hotel buscarPorCriteriaTipo(String tipo) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorCriteriaTipo(tipo);
	}

	@Override
	public Hotel buscarPorCriteriaCategoria(String categoria) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorCriteriaCategoria(categoria);
	}
	//JOIN TYPES
	
	@Override
	public List<Hotel> buscarPorInnerJoin(String categoria) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorInnerJoin(categoria);
	}

	@Override
	public List<Hotel> buscarPorRightJoin(String direccion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorRightJoin(direccion);
	}

	@Override
	public List<Hotel> buscarPorLeftJoin(String estrellas) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorLeftJoin(estrellas);
	}

	@Override
	public List<Hotel> buscarPorFullJoin(String estrellas) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorFullJoin(estrellas);
	}
	
	
}
