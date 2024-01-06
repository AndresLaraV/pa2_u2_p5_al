package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Libro;

public interface ILibroService {
	public Libro buscar(Integer id);

	public void guardar(Libro libro);

	public void actualizar(Libro libro);

	public void borrar(Integer id);
}
