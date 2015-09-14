package br.com.alisson_oliveira.services;

import br.com.alisson_oliveira.domain.ExampleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Alisson on 13/09/2015.
 */
@Service
public interface ExampleService extends CrudRepository<ExampleEntity, Long> {

    default String helloWorld(){
        return "Hello World Spring Boot";
    }

}
