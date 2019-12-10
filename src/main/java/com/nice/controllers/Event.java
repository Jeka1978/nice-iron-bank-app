package com.nice.controllers;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Evgeny Borisov
 */
@Data
@Entity
public class Event {

    @GeneratedValue
    @Id
    private int id;
    private String title;


}
