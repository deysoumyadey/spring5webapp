package com.example.spring5webapp.repositories;

import com.example.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by SD on 5/20/2018
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
