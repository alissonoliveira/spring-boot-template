package br.com.alisson_oliveira.controllers;

import br.com.alisson_oliveira.domain.ExampleEntity;
import br.com.alisson_oliveira.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alisson on 13/09/2015.
 */
@RestController
@RequestMapping("/ex")
public class ExampleController {

    @Autowired
    private ExampleService service;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Iterable<ExampleEntity> testGet() {
        return service.findAll();
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public ResponseEntity<String> testPost(@RequestBody ExampleEntity entity) {
        service.save(entity);
        return new ResponseEntity<String>("Saved!", HttpStatus.ACCEPTED);
    }

}
