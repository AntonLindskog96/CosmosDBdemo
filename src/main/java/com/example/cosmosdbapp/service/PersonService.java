package com.example.cosmosdbapp.service;

import com.example.cosmosdbapp.model.Person;
import com.example.cosmosdbapp.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public Person createPerson(Person person) {
        return personRepo.save(person);
    }
    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }
    public boolean deletePerson(String id) {
        if (personRepo.existsById(id)) {
            personRepo.deleteById(id);
            return true;
        }
        return false;
    }
    public Optional<Person> getPersonById(String id) {
        return personRepo.findById(id);
    }
}
