package com.uce.edu.ec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		// TODO Auto-generated method stub
		// Hibernate: select
		// h1_0.hotel_id,h1_0.hotel_categoria,h1_0.hotel_direccion,h1_0.hotel_estrellas,h1_0.hotel_nombre,h1_0.hotel_tipo
		// from hotel h1_0 where h1_0.hotel_nombre=?
		Hotel h1 = this.iHotelService.buscarPorCriteriaNombre("Hotel Golden");
		System.out.println(h1);

		// Hibernate: select
		// h1_0.hotel_id,h1_0.hotel_categoria,h1_0.hotel_direccion,h1_0.hotel_estrellas,h1_0.hotel_nombre,h1_0.hotel_tipo
		// from hotel h1_0 where h1_0.hotel_categoria=?
		Hotel h2 = this.iHotelService.buscarPorCriteriaCategoria("Familiar");
		System.out.println(h2);

		// Hibernate: select
		// h1_0.hotel_id,h1_0.hotel_categoria,h1_0.hotel_direccion,h1_0.hotel_estrellas,h1_0.hotel_nombre,h1_0.hotel_tipo
		// from hotel h1_0 where h1_0.hotel_direccion=?
		Hotel h3 = this.iHotelService.buscarPorCriteriaDireccion("Calderon");
		System.out.println(h3);

		// Hibernate: select
		// h1_0.hotel_id,h1_0.hotel_categoria,h1_0.hotel_direccion,h1_0.hotel_estrellas,h1_0.hotel_nombre,h1_0.hotel_tipo
		// from hotel h1_0 where h1_0.hotel_estrellas=?
		Hotel h4 = this.iHotelService.buscarPorCriteriaEstrellas("4 Estrellas");
		System.out.println(h4);

		// Hibernate: select
		// h1_0.hotel_id,h1_0.hotel_categoria,h1_0.hotel_direccion,h1_0.hotel_estrellas,h1_0.hotel_nombre,h1_0.hotel_tipo
		// from hotel h1_0 where h1_0.hotel_tipo=?
		Hotel h5 = this.iHotelService.buscarPorCriteriaTipo("Economico");
		System.out.println(h5);

	}

}
