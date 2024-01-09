package com.uce.edu.ec.repository.modelo;

import java.time.LocalDateTime;
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
@Table(name = "libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_libro")
	@SequenceGenerator(name = "seq_libro", sequenceName = "seq_libro", allocationSize = 1)

	@Column(name = "libro_id")
	private Integer id;

	@Column(name = "libro_titulo")
	private String titulo;

	@Column(name = "libro_fecha_publicacion")
	private LocalDateTime fechaPublicacion;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "autor_libro", joinColumns = @JoinColumn(name = "auli_id_libro"), 
	inverseJoinColumns = @JoinColumn(name = "auli_id_autor"))
	// Orden primero la tabla secunadaria y luego la principal, libro y autor respectivamente
	// nombre de la tabla de rompimiento y lleva el nombre de las dos entidades
	// es para crear las nuevas columnas en la tabla de rompimiento para id de autor
	// y para id de libro
	private Set<Autor> autores;

	// Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDateTime getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", fechaPublicacion=" + fechaPublicacion +  "]";
	}
	
	

}
