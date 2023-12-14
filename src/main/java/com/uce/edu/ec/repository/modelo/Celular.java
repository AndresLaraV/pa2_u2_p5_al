package com.uce.edu.ec.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "celular")
public class Celular {
	@Id
	@Column(name = "cel_imei")
	private String imei;
	
	@Column(name = "cel_marca")
	private String marca;
	
	@Column(name = "cel_sistemaOperativo")
	private String sistemaOperativo;
	
	@Column(name = "cel_bateria")
	private int bateria;
	
	@Column(name = "cel_almacenimiento")
	private String almacenamiento;

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public String getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	
}
