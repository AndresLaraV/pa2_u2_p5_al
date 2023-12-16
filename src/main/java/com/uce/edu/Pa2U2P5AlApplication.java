package com.uce.edu;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Alumno;
import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.service.IAlumnoService;
import com.uce.edu.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P5AlApplication implements CommandLineRunner {
	@Autowired
	private IEstudianteService iEstudianteService;

	@Autowired
	private IAlumnoService iAlumnoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * Estudiante estudiante = new Estudiante(); estudiante.setNombre("Andres");
		 * estudiante.setApellido("Lara"); estudiante.setCedula("1722121835");
		 * //this.iEstudianteService.guardar(estudiante);
		 * 
		 * estudiante.setFechaNacimiento(LocalDateTime.of(1995, 12, 9, 13, 20));
		 */
		// this.iEstudianteService.actualizar(estudiante);

		// this.iEstudianteService.borrar(2);
		// Estudiante estu1 = this.iEstudianteService.buscar(52);
		// System.out.println(estu1);

		Alumno alumno = new Alumno();
		alumno.setNombre("Sebastian");
		//this.iAlumnoService.guardar(alumno);

		System.out.println(alumno);
		
		Alumno alum1 = this.iAlumnoService.buscar(1);
		alum1.setNombre("CR7");
		this.iAlumnoService.actualizar(alum1);
		System.out.println(alum1);
		
		Alumno alum2 = this.iAlumnoService.buscar(2);
		alum2.setNombre("Suarez");
		this.iAlumnoService.actualizar(alum2);
		System.out.println(alum2);
		
	}

}
