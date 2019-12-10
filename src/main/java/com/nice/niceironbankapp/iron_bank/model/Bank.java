package com.nice.niceironbankapp.iron_bank.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Evgeny Borisov
 */
@Data
@Entity
public class Bank {

    @GeneratedValue
    @Id
    private int id;

    private int balance;












}
