//package com.nice.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import java.util.List;
//import java.util.Optional;
//
///**
// * @author Evgeny Borisov
// */
//@Service
//public class PersonService {
//    @Autowired
//    private PersonDao personDao;
//
//    @Autowired
//    private EntityManager entityManager;
//
//
//    @Transactional
//    public void save(Person person) {
//        person.setAge(10);
//        entityManager.merge(person);
//        person.setAge(12);
//    }
//
//    @Transactional
//    public void processPerson() {
//        List<Person> people = personDao.findAll();
//
//        Optional<Person> person1 = personDao.findById(21);
//        person1.map(person -> person.events)
//
//        //end of transaction
//
//        people.forEach(person -> person.setAge(120));
//    }
//}
//
//
//
//
//
