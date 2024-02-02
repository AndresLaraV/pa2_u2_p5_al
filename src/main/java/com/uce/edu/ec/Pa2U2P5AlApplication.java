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
		List<Hotel> lista = this.iHotelService.buscarPorInnerJoin();
		for (Hotel h : lista) {
			System.out.println(h.getEstrellas());
		}
		List<Hotel> lista1 = this.iHotelService.buscarPorInnerJoin();
		for (Hotel h : lista1) {
			System.out.println(h.getCategoria());
		}
		System.out.println();
		System.out.println("RIGHT JOIN");
		List<Hotel> lista2 = this.iHotelService.buscarPorRightJoin();
		for (Hotel h : lista2) {
			System.out.println(h.getNombre());
		}
		List<Hotel> lista3 = this.iHotelService.buscarPorRightJoin();
		for (Hotel h : lista3) {
			System.out.println(h.getCategoria());
		}
		System.out.println();
		System.out.println("LEFT JOIN");
		List<Hotel> lista4 = this.iHotelService.buscarPorLeftJoin();
		for (Hotel h : lista4) {
			System.out.println(h.getDireccion());
		}

		List<Hotel> lista5 = this.iHotelService.buscarPorLeftJoin();
		for (Hotel h : lista5) {
			System.out.println(h.getTipo());
		}
		System.out.println();
		System.out.println("FULL JOIN");
		List<Hotel> lista6 = this.iHotelService.buscarPorFullJoin();
		for (Hotel h : lista6) {
			System.out.println(h.getEstrellas());
		}
		List<Hotel> lista7 = this.iHotelService.buscarPorFullJoin();
		for (Hotel h : lista7) {
			System.out.println(h.getDireccion());
		}
		System.out.println();
		System.out.println("JOIN FETCH");
		List<Hotel> lista8 = this.iHotelService.buscarPorFetchJoin();
		for (Hotel h : lista8) {
			System.out.println(h.getNombre());
			System.out.println(h.getDireccion());
		}
		List<Hotel> lista9 = this.iHotelService.buscarPorFetchJoin();
		for (Hotel h : lista9) {
			System.out.println(h.getDireccion());
		}
	}

}
