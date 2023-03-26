package com.example.springbootdemo.controller;

import com.example.springbootdemo.domain.Cat;
import com.example.springbootdemo.service.CatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/cat")
public class CatController {

    Logger logger = LoggerFactory.getLogger(CatController.class);
    private final AtomicLong counter = new AtomicLong();
    private final CatService catService;

    @Autowired
    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping
    public Cat getCat(@RequestParam(value = "breed", defaultValue = "Domestic short-hair") String breed,
                      @RequestParam(value = "name", defaultValue = "Fluffy") String name) {
        logger.info("Cat has been returned");
        return new Cat(counter.incrementAndGet(), breed, name, "Neutral", "...");
    }

    @PutMapping(value = "/pet", consumes = "application/json", produces = "application/json")
    public Cat petCat(@RequestBody Cat cat) {
        logger.info("Cat has been petted");
        catService.interactWith(cat);
        return cat;
    }
}
