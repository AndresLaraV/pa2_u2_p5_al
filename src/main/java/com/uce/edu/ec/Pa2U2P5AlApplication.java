package com.uce.edu.ec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Ciudadano;
import com.uce.edu.ec.repository.modelo.Hotel;
import com.uce.edu.ec.service.ICiudadanoService;
import com.uce.edu.ec.service.IHotelService;

@SpringBootApplication
public class Pa2U2P5AlApplication implements CommandLineRunner {

	@Autowired
	IHotelService iHotelService;

	@Autowired
	ICiudadanoService iCiudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		 Ciudadano ciud1 = new Ciudadano(); ciud1.setNombre("Andres");
		  ciud1.setApellido("Lara"); 
		  ciud1.setCedula("1722121835");
		  ciud1.setCiudadOrigen("Quito"); 
		  ciud1.setCodigoDactilar("V001C"); 
		  this.iCiudadanoService.guardar(ciud1);
		  
		  Ciudadano ciud2 = new Ciudadano();
		  ciud2.setNombre("Sebastian");
		  ciud2.setApellido("Herrera"); 
		  ciud2.setCedula("1717171717");
		  ciud2.setCiudadOrigen("Tulcan"); 
		  ciud2.setCodigoDactilar("V002C"); 
		  this.iCiudadanoService.guardar(ciud2);
		  
		  Hotel hotel1 = new Hotel(); 
		  hotel1.setDireccion("Av Colon");
		  hotel1.setNombre("Hotel Casa Blanca"); 
		  hotel1.setEstrellas("5 Estrellas");
		  hotel1.setTipo("Economico"); 
		  hotel1.setCategoria("Familiar"); 
		  this.iHotelService.guardar(hotel1);
		  
		  Hotel hotel2 = new Hotel(); 
		  hotel2.setDireccion("Av Amazonas");
		  hotel2.setNombre("Hotel Swishotel");
		  hotel2.setEstrellas("4 Estrellas");
		  hotel2.setTipo("Aventura"); 
		  hotel2.setCategoria("Premiun"); 
		  this.iHotelService.guardar(hotel2);
		  
		  Ciudadano ciud3 = new Ciudadano(); 
		  ciud3.setNombre("Vanessa");
		  ciud3.setApellido("Muñoz"); 
		  ciud3.setCedula("1234567890");
		  ciud3.setCiudadOrigen("Ambato"); 
		  ciud3.setCodigoDactilar("V003C"); 
		  this.iCiudadanoService.guardar(ciud3);
		  
		  Hotel hotel3 = new Hotel(); 
		  hotel3.setDireccion("Calderon");
		  hotel3.setNombre("Hotel Platino"); 
		  hotel3.setEstrellas("3 Estrellas");
		  hotel3.setTipo("Casual");
		  hotel3.setCategoria("Confot"); 
		  this.iHotelService.guardar(hotel3);
		  
		  Hotel hotel4 = new Hotel(); 
		  hotel4.setDireccion("Av Prensa");
		  hotel4.setNombre("Hotel Terra"); 
		  hotel4.setEstrellas("2 Estrellas");
		  hotel4.setTipo("Descanso"); 
		  hotel4.setCategoria("Solo Adultos"); 
		  this.iHotelService.guardar(hotel4);
		  
		  Ciudadano ciud4 = new Ciudadano(); ciud4.setNombre("Luis");
		  ciud4.setApellido("Coral"); ciud4.setCedula("1704983491");
		  ciud4.setCiudadOrigen("Pasto"); ciud4.setCodigoDactilar("V004C"); 
		  this.iCiudadanoService.guardar(ciud4);
		  
		  Hotel hotel5 = new Hotel(); hotel5.setDireccion("Eloy Alfaro");
		  hotel5.setNombre("Hotel Golden"); hotel5.setEstrellas("1 Estrella");
		  hotel5.setTipo("ABnB"); hotel5.setCategoria("Todo Publico"); 
		  this.iHotelService.guardar(hotel5);
		  
		  Ciudadano ciud5 = new Ciudadano(); ciud5.setNombre("Oswaldo");
		  ciud5.setApellido("Ciceron"); ciud5.setCedula("1704954321");
		  ciud5.setCiudadOrigen("Guaranda"); ciud5.setCodigoDactilar("V005C"); 
		  this.iCiudadanoService.guardar(ciud5);
		  
		  // Native Query 
		  Ciudadano ciu1 = this.iCiudadanoService.buscarPorNombreCiud("Andres");
		  System.out.println(ciu1); Ciudadano ciu2 =
		  this.iCiudadanoService.buscarPorApellidoCiud("Herrera");
		  System.out.println(ciu2); Ciudadano ciu3 =
		  this.iCiudadanoService.buscarPorCedulaCiud("1234567890");
		  System.out.println(ciu3); Ciudadano ciu4 =
		  this.iCiudadanoService.buscarPorCiudadOrigenCiud("Pasto");
		  System.out.println(ciu4); Ciudadano ciu5 =
		  this.iCiudadanoService.buscarPorCodigoDactilar("V005C");
		  System.out.println(ciu5);
		  
		  // Typed Query 
		  Hotel h1 = this.iHotelService.buscarPorNombre("Hotel Casa Blanca");
		  System.out.println(h1); 
		  Hotel h2 = this.iHotelService.buscarPorDireccion("Av Amazonas"); 
		  System.out.println(h2);
		  Hotel h3 = this.iHotelService.buscarPorEstrellas("3 Estrellas");
		  System.out.println(h3); Hotel h4 =
		  this.iHotelService.buscarPorTipo("Descanso"); System.out.println(h4); Hotel
		  h5 = this.iHotelService.buscarPorCategoria("Todo Publico");
		  System.out.println(h5);


	}

}
