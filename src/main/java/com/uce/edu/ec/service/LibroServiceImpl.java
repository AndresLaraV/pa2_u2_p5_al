package com.uce.edu.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.repository.ILibroRepository;
import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.repository.modelo.Libro2;

@Service
public class LibroServiceImpl implements ILibroService {

	@Autowired
	ILibroRepository iLibroRepository;
	
	@Autowired
	ILibroService iLibroService;

	@Override
	public Libro buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iLibroRepository.seleccionar(id);
	}

	@Override
	public void guardar(Libro libro) {
		// TODO Auto-generated method stub
		this.iLibroRepository.insertar(libro);
	}
	public void guardar(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.iLibroRepository.insertar(libro2);
	}
	
	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		this.iLibroRepository.actualizar(libro);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iLibroRepository.eliminar(id);
	}

	@Override
	public Libro buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		
		return this.iLibroRepository.seleccionarPorNombre(nombre);
	}

}
