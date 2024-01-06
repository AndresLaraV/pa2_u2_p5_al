package com.uce.edu.ec.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro2")
public class Libro2 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_libro2")
	@SequenceGenerator(name = "seq_libro2", sequenceName = "seq_libro2", allocationSize = 1)

	@Column(name = "libro2_id")
	private Integer id;

	@Column(name = "libro2_titulo")
	private String titulo;

	@Column(name = "libro2_fecha_publicacion")
	private LocalDateTime fechaPublicacion;

	private List <AutorLibro> autoresLibros;
	

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



}
