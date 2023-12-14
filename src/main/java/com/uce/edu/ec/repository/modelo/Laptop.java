package com.uce.edu.ec.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Laptop")
public class Laptop {

	@Id
	@Column(name = "lap_ip")
	private String ip;

	@Column(name = "lap_procesador")
	private String procesador;

	@Column(name = "lap_ram")
	private String ram;

	@Column(name = "lap_tamañoPantalla")
	private String tamañoPantalla;

	@Column(name = "lap_peso")
	private String peso;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getTamañoPantalla() {
		return tamañoPantalla;
	}

	public void setTamañoPantalla(String tamañoPantalla) {
		this.tamañoPantalla = tamañoPantalla;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

}
