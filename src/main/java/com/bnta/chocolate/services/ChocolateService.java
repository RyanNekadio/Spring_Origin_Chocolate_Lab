package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChocolateService {

    //saving chocolate method

    @Autowired
    ChocolateRepository chocolateRepository;

    public Chocolate saveChocolate(Chocolate chocolate){
        chocolateRepository.save(chocolate);        //returning object, chocolate
        return chocolate;
    }
}