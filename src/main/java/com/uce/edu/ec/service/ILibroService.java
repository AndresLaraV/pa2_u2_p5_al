package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.repository.modelo.Libro2;

public interface ILibroService {
	public Libro buscar(Integer id);

	public void guardar(Libro libro);
	public void guardar(Libro2 libro2);
	public void actualizar(Libro libro);

	public void borrar(Integer id);
	
	public Libro buscarPorNombre (String nombre);
}
