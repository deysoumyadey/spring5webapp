package com.example.spring5webapp.repositories;

import com.example.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by SD on 5/20/2018
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
