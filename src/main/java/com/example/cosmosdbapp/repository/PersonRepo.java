package com.example.cosmosdbapp.repository;

import com.example.cosmosdbapp.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends MongoRepository<Person, String> {
}
