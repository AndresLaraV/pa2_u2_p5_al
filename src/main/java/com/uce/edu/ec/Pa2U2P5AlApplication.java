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

	// 1. Query usa (JPQL)
	// 1.1 TypedQuery
	// 1.2 NamedQuery
	// 2. Native Query
	// 3. Criteria API Query

	@Autowired
	ICiudadanoService iCiudadanoService;
	
	@Autowired
	IEmpleadoService iEmpleadoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Ciudadano ciud2 = new Ciudadano ();
		ciud2.setNombre("Andres");
		ciud2.setApellido("Lara");
		ciud2.setCedula("1722121835");
		//this.iCiudadanoService.guardar(ciud2);
		
		Empleado emple = new Empleado ();
		emple.setSalario(new BigDecimal(50));
		emple.setFechaIngreso(LocalDate.now());
		//emple.setCiudadano(ciud2);
		//this.iEmpleadoService.guardar(emple);
		
		//Empleado emple1 = this.iCiudadanoService.buscarPorCedula("1722121835");
		//System.out.println(emple1);
		
		Empleado emple1 = this.iCiudadanoService.buscarPorCedula("1722121835");
		System.out.println(emple1);
	}

}
