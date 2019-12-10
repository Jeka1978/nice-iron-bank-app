package com.nice.niceironbankapp.iron_bank.services;

import com.nice.ironbankstarterfornice.ConditionalOnProd;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@Profile("WINTER_IS_COMING")
public class PredictionServiceImpl implements PredictionService {
    @Override
    public boolean willSurviveTheWinter(String name) {
        return !name.toLowerCase().contains("stark");
    }
}
