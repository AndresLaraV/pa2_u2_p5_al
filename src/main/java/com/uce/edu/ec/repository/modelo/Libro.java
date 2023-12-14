package com.uce.edu.ec.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {

	@Id
	@Column(name = "lib_titulo")
	private String titulo;

	@Column(name = "lib_autor")
	private String autor;

	@Column(name = "lib_genero")
	private String genero;

	@Column(name = "lib_paginas")
	private int paginas;

	@Column(name = "lib_editorial")
	private String editorial;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

}
