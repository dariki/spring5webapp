package br.com.ariki.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.ariki.spring5webapp.repository.AuthorRepository;
import br.com.ariki.spring5webapp.repository.BookRepository;

@SpringBootApplication
public class Spring5webappApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(Spring5webappApplication.class, args);
	}
}
