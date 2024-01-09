package com.uce.edu.ec;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Autor2;
import com.uce.edu.ec.repository.modelo.AutorLibro;
import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.repository.modelo.Libro2;
import com.uce.edu.ec.service.ILibroService;

@SpringBootApplication
public class Pa2U2P5AlApplication implements CommandLineRunner {

	@Autowired
	private ILibroService iLibroService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub


		Libro2 libro = new Libro2();
		libro.setTitulo("JAVA2");
		libro.setFechaPublicacion(LocalDateTime.now());

		Autor2 autor1 = new Autor2();
		autor1.setNacionalidad("Ecuatoriano");
		autor1.setNombre("Daniel Tirira");

		Autor2 autor2 = new Autor2();
		autor2.setNacionalidad("Ecuatoriano");
		autor2.setNombre("Alfredo Teran");

		List <Autor2> autores = new ArrayList<Autor2>();
		autores.add(autor1);
		autores.add(autor2);

		AutorLibro autorLibro1 = new AutorLibro();
		autorLibro1.setLibro2(libro);
		autorLibro1.setAutor2(autor1);
		
		AutorLibro autorLibro2 = new AutorLibro();
		autorLibro2.setLibro2(libro);
		autorLibro2.setAutor2(autor2);
		
		//Seteamos un libro con dos autores
		// Hay que ponerlo en una lista xq el libro.set recibe una lista de AutoreLibros
		
		List<AutorLibro> lista = new ArrayList<>();
		lista.add(autorLibro1);
		lista.add(autorLibro2);
		
		libro.setAutoresLibros(lista);
		
		//this.iLibroService.guardar(libro);
		
		Libro libroFinal = this.iLibroService.buscarPorNombre("JAVA");
		System.out.println(libroFinal);
	}

}
