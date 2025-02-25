package com.example.cosmosdbapp.service;

import com.example.cosmosdbapp.model.Person;
import com.example.cosmosdbapp.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public Person createPerson(Person person) {
        return personRepo.save(person);
    }
}
