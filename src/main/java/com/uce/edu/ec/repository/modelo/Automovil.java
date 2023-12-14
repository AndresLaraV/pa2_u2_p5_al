package com.uce.edu.ec.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "automovil")
public class Automovil {
	@Id
	@Column(name = "auto_chasis")
	private String chasis;
	
	@Column(name = "auto_marca")
	private String marca;
	
	@Column(name = "auto_modelo")
	private String modelo;
	
	@Column(name = "auto_color")
	private String color;
	
	@Column(name = "auto_precio")
	private BigDecimal precio;
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	

}
