package com.uce.edu.ec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Ciudadano;
import com.uce.edu.ec.service.ICiudadanoService;

@SpringBootApplication
public class Pa2U2P5AlApplication implements CommandLineRunner {

	@Autowired
	ICiudadanoService iCiudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Hibernate: select c1_0.ciud_id,c1_0.ciud_apellido,c1_0.ciud_cedula,c1_0.ciud_ciudad_origen,c1_0.ciud_codigo_dactilar,c1_0.ciud_nombre 
		//from ciudadano c1_0 where c1_0.ciud_nombre=?
		Ciudadano ciud = this.iCiudadanoService.buscarPorCriteria("Andres", "Lara", "1722121835");
		System.out.println(ciud);
		
		//select c1_0.ciud_id,c1_0.ciud_apellido,c1_0.ciud_cedula,c1_0.ciud_ciudad_origen,c1_0.ciud_codigo_dactilar,c1_0.ciud_nombre
		//from ciudadano c1_0 where c1_0.ciud_apellido=
		Ciudadano ciud2 = this.iCiudadanoService.buscarPorCriteria("Andres", "Lara", "0522121835");
		System.out.println(ciud2);
		
		//select c1_0.ciud_id,c1_0.ciud_apellido,c1_0.ciud_cedula,c1_0.ciud_ciudad_origen,c1_0.ciud_codigo_dactilar,c1_0.ciud_nombre 
		//from ciudadano c1_0 where c1_0.ciud_cedula=?
		//Ciudadano ciud3 = this.iCiudadanoService.buscarPorCriteria("Andres", "Lara", "0622121835");
		//System.out.println(ciud3);
		
		System.out.println("AND OR");
		// select c1_0.ciud_id,c1_0.ciud_apellido,c1_0.ciud_cedula,c1_0.ciud_ciudad_origen,c1_0.ciud_codigo_dactilar,c1_0.ciud_nombre 
		//from ciudadano c1_0 where c1_0.ciud_nombre=? or c1_0.ciud_apellido=?
		Ciudadano ciud4 = this.iCiudadanoService.buscarPorCriteriaAndOr("Andres", "Lara", "1722121835");
		System.out.println(ciud4);
		
		//select c1_0.ciud_id,c1_0.ciud_apellido,c1_0.ciud_cedula,c1_0.ciud_ciudad_origen,c1_0.ciud_codigo_dactilar,c1_0.ciud_nombre 
		//from ciudadano c1_0 where c1_0.ciud_nombre=? and c1_0.ciud_apellido=?
		Ciudadano ciud5 = this.iCiudadanoService.buscarPorCriteriaAndOr("Andres", "Lara", "0522121835");
		System.out.println(ciud5);


	}

}
