package com.uce.edu.ec;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.service.IAutorService;
import com.uce.edu.ec.service.ILibroService;

@SpringBootApplication
public class Pa2U2P5AlApplication implements CommandLineRunner {

	// 1. Query usa (JPQL)
	// 1.1 TypedQuery
	// 1.2 NamedQuery
	// 2. Native Query
	// 3. Criteria API Query

	@Autowired
	ILibroService iLibroService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TypedQuery");
		List<Libro> lista = this.iLibroService.buscarPorFecha(LocalDateTime.of(2023, 12, 1, 0, 0));
		for (Libro libro : lista) {
			System.out.println(libro);
		}

		Libro li1 = this.iLibroService.buscarPorTitulo("JAVA");
		System.out.println(li1);

		System.out.println("NamedQuery");
		Libro lib2 = this.iLibroService.buscarPorTituloNamed("JAVA");
		System.out.println(lib2);

		List<Libro> lista3 = this.iLibroService.buscarPorFechaPubliNamed(LocalDateTime.of(2023, 1, 1, 7, 15));
		for (Libro libro : lista3) {
			System.out.println(libro);
		}

	}

}
