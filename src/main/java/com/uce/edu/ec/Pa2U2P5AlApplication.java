package com.uce.edu.ec;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Habitacion;
import com.uce.edu.ec.repository.modelo.Hotel;
import com.uce.edu.ec.service.ICiudadanoService;
import com.uce.edu.ec.service.IEmpleadoService;
import com.uce.edu.ec.service.IHabitacionService;
import com.uce.edu.ec.service.IHotelService;

@SpringBootApplication
public class Pa2U2P5AlApplication implements CommandLineRunner {

	@Autowired
	private ICiudadanoService ciudadanoService;

	@Autowired
	private IEmpleadoService empleadoService;

	@Autowired
	private IHotelService hotelService;

	@Autowired
	private IHabitacionService habitacionService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * Ciudadano ciudadano1 = new Ciudadano(); ciudadano1.setNombre("Sebastian");
		 * ciudadano1.setApellido("Viana"); this.ciudadanoService.guardar(ciudadano1);
		 * 
		 * // Cargar el Ciudadano desde la base de datos antes de asignarlo al Empleado
		 * Ciudadano ciudadanoGuardado =
		 * this.ciudadanoService.buscar(ciudadano1.getId());
		 * 
		 * ciudadano1.setNombre("Patricio"); ciudadano1.setApellido("Amores");
		 * this.ciudadanoService.actualizar(ciudadano1);
		 * 
		 * Empleado empleado1 = new Empleado(); empleado1.setSalario(new
		 * BigDecimal(400)); empleado1.setFechaIngreso(LocalDate.now());
		 * empleado1.setCiudadano(ciudadanoGuardado);
		 * 
		 * this.empleadoService.guardar(empleado1);
		 */
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
