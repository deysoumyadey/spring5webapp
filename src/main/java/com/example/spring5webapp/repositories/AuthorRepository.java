package com.example.spring5webapp.repositories;

import com.example.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by SD on 5/20/2018
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
