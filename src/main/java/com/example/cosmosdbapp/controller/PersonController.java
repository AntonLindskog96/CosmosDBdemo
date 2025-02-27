package com.example.cosmosdbapp.controller;

import com.example.cosmosdbapp.model.Person;
import com.example.cosmosdbapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable String id) {
        Optional<Person> person = personService.getPersonById(id);
        return person.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable String id) {
        boolean isDeleted = personService.deletePerson(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
