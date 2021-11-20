package com.ritesh.graphql.examples.repository;

import com.ritesh.graphql.examples.entity.Person;
import org.springframework.data.repository.CrudRepository;


public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findByFirstName(String fisrtName);
}
