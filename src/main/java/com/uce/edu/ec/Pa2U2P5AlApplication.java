package com.uce.edu.ec;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Ciudadano;
import com.uce.edu.ec.repository.modelo.Empleado;
import com.uce.edu.ec.service.ICiudadanoService;
import com.uce.edu.ec.service.IEmpleadoService;

@SpringBootApplication
public class Pa2U2P5AlApplication implements CommandLineRunner {

	@Autowired
	private ICiudadanoService ciudadanoService;

	@Autowired
	private IEmpleadoService empleadoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Ciudadano ciudadano1 = new Ciudadano();
		ciudadano1.setNombre("Sebastian");
		ciudadano1.setApellido("Viana");
		this.ciudadanoService.guardar(ciudadano1);

		// Cargar el Ciudadano desde la base de datos antes de asignarlo al Empleado
		Ciudadano ciudadanoGuardado = this.ciudadanoService.buscar(ciudadano1.getId());
		
		ciudadano1.setNombre("Patricio");
		ciudadano1.setApellido("Amores");
		this.ciudadanoService.actualizar(ciudadano1);

		Empleado empleado1 = new Empleado();
		empleado1.setSalario(new BigDecimal(400));
		empleado1.setFechaIngreso(LocalDate.now());
		empleado1.setCiudadano(ciudadanoGuardado);

		this.empleadoService.guardar(empleado1);

	}

}
