package com.example.cosmosdbapp.controller;

import com.example.cosmosdbapp.model.Person;
import com.example.cosmosdbapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/people")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        Person savedPerson = personService.createPerson(person);
        return new ResponseEntity<>(savedPerson, HttpStatus.CREATED);
    }
}
