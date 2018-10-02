package br.com.ariki.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.ariki.spring5webapp.model.Author;
import br.com.ariki.spring5webapp.model.Book;
import br.com.ariki.spring5webapp.model.Publisher;
import br.com.ariki.spring5webapp.repository.AuthorRepository;
import br.com.ariki.spring5webapp.repository.BookRepository;
import br.com.ariki.spring5webapp.repository.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Publisher publisher1 = new Publisher("Penguin Classics");
		Book book1 = new Book("In Search of Lost Time", "978-0142437964", publisher1);
		Author author1 = new Author("Marcel", "Proust");
		book1.getAuthors().add(author1);
		author1.getBooks().add(book1);
		publisherRepository.save(publisher1);
		authorRepository.save(author1);
		bookRepository.save(book1);
		
		Publisher publisher2 = new Publisher("Ecco");
		Book book2 = new Book("Don Quixote", "978-0060934347", publisher2);
		Author author2 = new Author("Miguel", "De Cervantes");
		publisherRepository.save(publisher2);
		book2.getAuthors().add(author2);
		author2.getBooks().add(book2);
		
		authorRepository.save(author2);
		bookRepository.save(book2);
	}
	
}
