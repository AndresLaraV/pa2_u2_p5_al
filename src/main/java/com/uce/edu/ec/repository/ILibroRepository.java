package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Libro;

public interface ILibroRepository {
	public Libro seleccionar(Integer id);

	public void insertar(Libro libro);

	public void actualizar(Libro libro);

	public void eliminar(Integer id);
}
