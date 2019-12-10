package com.nice.niceironbankapp.iron_bank.controllers;

import com.nice.niceironbankapp.iron_bank.services.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequiredArgsConstructor
public class BankController {

    @Autowired
    private BankService bankService;

    @GetMapping("/loan")
    public String loan(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return bankService.loan(name, amount);
    }
}
