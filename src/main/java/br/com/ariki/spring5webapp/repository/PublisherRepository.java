package br.com.ariki.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import br.com.ariki.spring5webapp.model.Publisher;

@Component
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
