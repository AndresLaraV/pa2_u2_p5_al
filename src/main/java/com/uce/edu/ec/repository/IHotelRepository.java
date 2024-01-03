package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Hotel;

public interface IHotelRepository {
	public Hotel seleccionar(Integer id);

	public void insertar(Hotel hotel);
}
