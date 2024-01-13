package com.uce.edu.ec.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.ec.repository.modelo.Libro;

public interface ILibroRepository {
	public Libro seleccionar(Integer id);

	public void insertar(Libro libro);

	public void actualizar(Libro libro);

	public void eliminar(Integer id);

	public Libro seleccionarPorNombre(String nombre);

	public Libro seleccionarPorTitulo(String titulo);

	public List<Libro> seleccionarPorFecha(LocalDateTime fechaPublicacion);

	public List<Libro> seleccionarPorFechaPublicacion(LocalDateTime fechaPublicacion);

	public Libro seleccionarPorTituloNamed (String titulo);

	public List<Libro> seleccionarPorFechaPublicacionNamed (LocalDateTime fechaPublicacion);
}
