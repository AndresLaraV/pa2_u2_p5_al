package com.uce.edu.ec;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Autor;
import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.service.IAutorService;
import com.uce.edu.ec.service.ILibroService;

@SpringBootApplication
public class Pa2U2P5AlApplication implements CommandLineRunner {

	@Autowired
	IAutorService iAutorService;
	
	@Autowired
	ILibroService iLibroService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Libro libro = new Libro();
		libro.setTitulo("JAVA");
		libro.setFechaPublicacion(LocalDateTime.now());

		Autor autor1 = new Autor();
		autor1.setNacionalidad("Ecuatoriano");
		autor1.setNombre("Daniel Tirira");

		Autor autor2 = new Autor();
		autor2.setNacionalidad("Ecuatoriano");
		autor2.setNombre("Alfredo Teran");

		Set<Autor> autores = new HashSet<Autor>();
		autores.add(autor1);
		autores.add(autor2);

		libro.setAutores(autores);

		Set<Libro> libros = new HashSet<>();
		libros.add(libro);

		autor1.setLibros(libros);
		autor2.setLibros(libros);

		this.iLibroService.guardar(libro);
		


	}

}
