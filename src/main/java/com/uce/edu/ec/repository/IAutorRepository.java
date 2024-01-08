package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Autor;

public interface IAutorRepository {
	public Autor seleccionar(Integer id);

	public void insertar(Autor autor);

	public void actualizar(Autor autor);

	public void eliminar(Integer id);
}
