package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.repository.modelo.Libro2;

public interface ILibroRepository {

	public Libro seleccionar(Integer id);

	public void insertar(Libro libro);
	public void insertar(Libro2 libro2);
	public void actualizar(Libro libro);

	public void eliminar(Integer id);
	
	public Libro seleccionarPorNombre (String nombre);
}
