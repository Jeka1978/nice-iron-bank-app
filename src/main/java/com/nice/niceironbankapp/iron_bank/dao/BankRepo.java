package com.nice.niceironbankapp.iron_bank.dao;

import com.nice.niceironbankapp.iron_bank.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Evgeny Borisov
 */
@RepositoryRestResource
public interface BankRepo extends JpaRepository<Bank,Integer> {
}
