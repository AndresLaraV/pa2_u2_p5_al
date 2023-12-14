package com.uce.edu.ec.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estadio")
public class Estadio {
	@Id
	@Column(name = "esta_nombre")
	private String nombre;

	@Column(name = "esta_pais")
	private String pais;

	@Column(name = "esta_ciudad")
	private String ciudad;

	@Column(name = "esta_capacidad")
	private int capacidad;

	@Column(name = "esta_arquitecto")
	private String arquitecto;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getArquitecto() {
		return arquitecto;
	}

	public void setArquitecto(String arquitecto) {
		this.arquitecto = arquitecto;
	}

}
