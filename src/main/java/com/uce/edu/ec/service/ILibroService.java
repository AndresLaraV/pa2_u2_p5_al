package com.uce.edu.ec.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.ec.repository.modelo.Libro;

public interface ILibroService {
	public Libro buscar(Integer id);

	public void guardar(Libro libro);

	public void actualizar(Libro libro);

	public void borrar(Integer id);

	public Libro buscarPorNombre(String nombre);

	public Libro buscarPorTitulo(String titulo);

	public List<Libro> buscarPorFechaPubli(LocalDateTime fechaPublicacion);

	public List<Libro> buscarPorFecha(LocalDateTime fecha);

	public Libro buscarPorTituloNamed(String titulo);

	public List<Libro> buscarPorFechaPubliNamed(LocalDateTime fechaPublicacion);

}
