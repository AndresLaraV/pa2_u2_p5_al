package com.uce.edu.ec.repository.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_autor")
	@SequenceGenerator(name = "seq_autor", sequenceName = "seq_autor", allocationSize = 1)

	@Column(name = "auto_id")
	private Integer Id;

	@Column(name = "auto_nombre")
	private String nombre;

	@Column(name = "auto_nacionalidad")
	private String nacionalidad;

	@ManyToMany(mappedBy = "autores", cascade = CascadeType.ALL)
	// nombre de la otra entidad
	
	private Set<Libro> libros;

	// Set y Get
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Set<Libro> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}

}
