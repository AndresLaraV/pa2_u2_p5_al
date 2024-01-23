package com.uce.edu.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.repository.ICiudadanoRepository;
import com.uce.edu.ec.repository.modelo.Ciudadano;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService {

	@Autowired
	ICiudadanoRepository ciudadanoRepository;

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionar(id);
	}

	@Override
	public void guardar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepository.insertar(ciudadano);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepository.actualizar(ciudadano);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.ciudadanoRepository.eliminar(id);
	}

	@Override
	public Ciudadano buscarPorCedulaCiud(String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCedulaCiud(cedula);
	}

	@Override
	public Ciudadano buscarPorNombreCiud(String nombre) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorNombreCiud(nombre);
	}

	@Override
	public Ciudadano buscarPorApellidoCiud(String apellido) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorApellidoCiud(apellido);
	}

	@Override
	public Ciudadano buscarPorCodigoDactilar(String codigoDactilar) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCodigoDactilar(codigoDactilar);
	}

	@Override
	public Ciudadano buscarPorCiudadOrigenCiud(String ciudadOrigen) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCiudadOrigenCiud(ciudadOrigen);
	}


}
