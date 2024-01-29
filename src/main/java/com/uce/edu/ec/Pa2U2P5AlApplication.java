package com.uce.edu.ec;

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

	@Autowired
	IHotelService iHotelService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("INNER JOIN");
		List<Hotel> lista = this.iHotelService.buscarPorInnerJoin("Familiar");
		for (Hotel h : lista) {
			System.out.println(h);
		}
		System.out.println("RIGHT JOIN");
		List<Hotel> lista2 = this.iHotelService.buscarPorRightJoin("Av Patria");
		for (Hotel h : lista2) {
			System.out.println(h);
		}
		System.out.println("LEFT JOIN");
		List<Hotel> lista3 = this.iHotelService.buscarPorLeftJoin("4 Estrellas");
		for (Hotel h : lista3) {
			System.out.println(h);
		}
		System.out.println("FULL JOIN");
		List<Hotel> lista4 = this.iHotelService.buscarPorFullJoin("5 Estrellas");
		for (Hotel h : lista4) {
			System.out.println(h);
			for (Habitacion b : h.getHabitaciones()) {
				System.out.println(b);
			}
		}
	}

}
