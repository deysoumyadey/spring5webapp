package com.example.spring5webapp.bootstrap;

import com.example.spring5webapp.model.Author;
import com.example.spring5webapp.model.Book;
import com.example.spring5webapp.model.Publisher;
import com.example.spring5webapp.repositories.AuthorRepository;
import com.example.spring5webapp.repositories.BookRepository;
import com.example.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

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
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        Author rowling = new Author("J K", "Rowling");
        Publisher abcPublisher = new Publisher("ABC Publisher", "1234 ABCD Ln, ABCD City");
        Book harryPotter = new Book("Order of Phoenix", "1234", abcPublisher);

        rowling.getBooks().add(harryPotter);
        harryPotter.getAuthors().add(rowling);

        authorRepository.save(rowling);
        publisherRepository.save(abcPublisher);
        bookRepository.save(harryPotter);


        Author arthor =  new Author("Arthor Conan","Doyle");
        Publisher xyzPublisher = new Publisher("XYZ Publisher", "6789 XYZ Ln, XYZ City");
        Book sherlockHolmes = new Book("Hound", "6789", xyzPublisher);
        arthor.getBooks().add(sherlockHolmes);

        authorRepository.save(arthor);
        publisherRepository.save(xyzPublisher);
        bookRepository.save(sherlockHolmes);
    }
}
