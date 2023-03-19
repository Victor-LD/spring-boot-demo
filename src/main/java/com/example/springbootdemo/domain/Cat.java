package com.example.springbootdemo.domain;

public class Cat {
    private long id;
    private String breed;

    private String name;

    private String happinessState;

    private String sound;

    public Cat() {}

    public Cat(long id, String breed, String name) {
        this.id = id;
        this.breed = breed;
        this.name = name;
        this.happinessState = "Neutral";
        this.sound = "...";
    }

    public Cat(long id, String breed, String name, String happinessState, String sound) {
        this.id = id;
        this.breed = breed;
        this.name = name;
        this.happinessState = happinessState;
        this.sound = sound;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHappinessState() {
        return happinessState;
    }

    public void setHappinessState(String happinessState) {
        this.happinessState = happinessState;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
