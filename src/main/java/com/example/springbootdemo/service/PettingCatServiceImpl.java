package com.example.springbootdemo.service;

import com.example.springbootdemo.domain.Cat;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("pettingCatService")
public class PettingCatServiceImpl implements CatService {

    @Override
    public void interactWith(Cat cat) {
        // Imagine the cat is having his chin scratched here
        cat.setHappinessState("Content");
        cat.setSound("Purr...");
    }
}
