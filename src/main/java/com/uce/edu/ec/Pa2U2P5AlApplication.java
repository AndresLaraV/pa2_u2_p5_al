package com.uce.edu.ec;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Habitacion;
import com.uce.edu.ec.repository.modelo.Hotel;
import com.uce.edu.ec.service.IHotelService;

@SpringBootApplication
public class Pa2U2P5AlApplication implements CommandLineRunner {

	/*@Autowired
	private ICiudadanoService ciudadanoService;

	@Autowired
	private IEmpleadoService empleadoService;*/

	@Autowired
	private IHotelService hotelService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*Ciudadano ciudadano1 = new Ciudadano();
		ciudadano1.setNombre("Sebastian");
		ciudadano1.setApellido("Viana");*/
		
		//this.ciudadanoService.guardar(ciudadano1);

		// Cargar el Ciudadano desde la base de datos antes de asignarlo al Empleado
		//Ciudadano ciudadanoGuardado = this.ciudadanoService.buscar(ciudadano1.getId());

		/*Empleado empleado1 = new Empleado();
		empleado1.setSalario(new BigDecimal(500));
		empleado1.setFechaIngreso(LocalDate.now());
		empleado1.setCiudadano(this.ciudadanoService.buscar(5));
		
		this.empleadoService.guardar(empleado1);*/

		/*Ciudadano ciudadano2 = new Ciudadano();
		ciudadano2.setNombre("Vanessa");
		ciudadano2.setApellido("Muñoz");
		//this.ciudadanoService.guardar(ciudadano2);
		
		Empleado empleado2 = new Empleado();
		empleado2.setSalario(new BigDecimal(460));
		empleado2.setFechaIngreso(LocalDate.now());
		empleado2.setCiudadano(ciudadano2);
		this.empleadoService.guardar(empleado2);*/
		
		
		/*Empleado empleado3 = new Empleado();
		empleado3.setSalario(new BigDecimal(580));
		empleado3.setFechaIngreso(LocalDate.now());
		//empleado3.setCiudadano(ciudadano3);
		//this.empleadoService.guardar(empleado3);
		
		Ciudadano ciudadano3 = new Ciudadano();
		ciudadano3.setNombre("Luis");
		ciudadano3.setApellido("Caicedo");
		ciudadano3.setEmpleado(empleado3);
		empleado3.setCiudadano(ciudadano3);
		this.ciudadanoService.guardar(ciudadano3);*/
		
		Hotel hotel = new Hotel();
		hotel.setDireccion("Av Colon");
		hotel.setNombre("Hotel Colon");
		//hotel.set
		
		Habitacion h1 = new Habitacion();
		h1.setClase("Economica");
		h1.setNumero("A1");
		h1.setHotel(hotel);
		
		Habitacion h2 = new Habitacion();
		h2.setClase("Presidencial");
		h2.setNumero("A2");
		h2.setHotel(hotel);
		
		List <Habitacion> habitaciones = new ArrayList<>(); 
		habitaciones.add(h1);
		habitaciones.add(h2);
		
		hotel.setHabitaciones(habitaciones);
		
		this.hotelService.guardar(hotel);
	}

}
