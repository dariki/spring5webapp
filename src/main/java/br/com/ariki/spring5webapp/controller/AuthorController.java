package br.com.ariki.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ariki.spring5webapp.repository.AuthorRepository;

@Controller
public class AuthorController {

	private AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	@RequestMapping("/authors")
	public String getBooks(Model model ) {
		model.addAttribute("authors", authorRepository.findAll());
		return "authors";
	}
}