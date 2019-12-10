package com.nice.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import lombok.experimental.Wither;

import javax.persistence.*;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
@Wither
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;

    @OneToMany(cascade = CascadeType.ALL)
    @Singular
    List<Event> events;


    @SneakyThrows
    public static void main(String[] args) {
        Person person = Person.builder().name("Aviv").age(37).build();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(person);
        System.out.println(json);
        Person person1 = mapper.readValue(json, Person.class);

        System.out.println("person1 = " + person1);
    }
}
