package com.example.springbootdemo.service;

import com.example.springbootdemo.domain.Cat;
import org.springframework.stereotype.Service;

@Service("teasingCatService")
public class TeasingCatServiceImpl implements CatService {

    @Override
    public void interactWith(Cat cat) {
        // Imagine the cat here is being annoyed by having his tail pulled
        // (PSA don't do this in real life)
        cat.setHappinessState("Annoyed");
        cat.setSound("Hiss!!");
    }
}

