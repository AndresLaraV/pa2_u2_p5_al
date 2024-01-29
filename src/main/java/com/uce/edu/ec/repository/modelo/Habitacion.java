package com.uce.edu.ec.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "habitacion")
public class Habitacion {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_habitacion")
	@SequenceGenerator(name = "seq_habitacion", sequenceName = "seq_habiacion", allocationSize = 1)

	@Column(name = "habi_id")
	private Integer id;

	@Column(name = "habi_numero")
	private String numero;

	@Column(name = "habi_clase")
	private String clase;

	@Column(name = "habi_num_camas")
	private String numCamas;

	@ManyToOne
	@JoinColumn(name = "habi_id_hotel")
	private Hotel hotel;

	// Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	public String getNumCamas() {
		return numCamas;
	}

	public void setNumCamas(String numCamas) {
		this.numCamas = numCamas;
	}

	@Override
	public String toString() {
		return "Habitacion [id=" + id + ", numero=" + numero + ", clase=" + clase + ", numCamas=" + numCamas + "]";
	}


}
