package com.nice.niceironbankapp.iron_bank.services;

import com.nice.ironbankstarterfornice.NotEnoughMoneyException;
import com.nice.niceironbankapp.iron_bank.dao.BankRepo;
import com.nice.niceironbankapp.iron_bank.model.Bank;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class BankService {


    @Autowired
    private BankRepo bankRepo;
    @Autowired
    private PredictionService predictionService;

    @Transactional
    public String loan(String name, int amount) {
        Bank bank = bankRepo.findAll().get(0);
        if (bank.getBalance() <= amount) {
            throw new NotEnoughMoneyException("no money in iron bank");
        }
        if (predictionService.willSurviveTheWinter(name)) {
            bank.setBalance(bank.getBalance()-amount);
            return "loan was accepted. money left: " + bank.getBalance();
        }else {
            return "loan rejected, you will not survive the winter ";
        }
    }


    @Transactional
    @EventListener(ContextRefreshedEvent.class)
    protected void fillBank() {
        Bank bank = new Bank();
        bank.setBalance(1000);
        bankRepo.save(bank);
    }











}









