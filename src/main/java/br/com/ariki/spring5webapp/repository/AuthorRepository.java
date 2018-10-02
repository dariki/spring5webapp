package br.com.ariki.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import br.com.ariki.spring5webapp.model.Author;

@Component
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
