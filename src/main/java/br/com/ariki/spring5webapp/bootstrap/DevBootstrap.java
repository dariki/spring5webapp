package br.com.ariki.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.ariki.spring5webapp.model.Author;
import br.com.ariki.spring5webapp.model.Book;
import br.com.ariki.spring5webapp.repository.AuthorRepository;
import br.com.ariki.spring5webapp.repository.BookRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Book book1 = new Book("In Search of Lost Time", "978-0142437964", "Penguin Classics");
		Author author1 = new Author("Marcel", "Proust");
		book1.getAuthors().add(author1);
		author1.getBooks().add(book1);
		authorRepository.save(author1);
		bookRepository.save(book1);
		
		Book book2 = new Book("Don Quixote", "978-0060934347", "Ecco");
		Author author2 = new Author("Miguel", "De Cervantes");
		
		book2.getAuthors().add(author2);
		author2.getBooks().add(book2);
		
		authorRepository.save(author2);
		bookRepository.save(book2);
	}
	
}
