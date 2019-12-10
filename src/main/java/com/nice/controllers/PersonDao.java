package com.nice.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@RepositoryRestResource
public interface PersonDao extends JpaRepository<Person,Integer> {


    @RestResource(path = "byAge")
    List<Person> findPleaaaaaseByAgeGreaterThan(int age);

}
