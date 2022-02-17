package com.epam.spring.homework1.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Pet {
    private List<Animal> list;

    @Autowired
    public Pet(List<Animal> list) {
        this.list = list;
    }

    public void printPets() {
        for(Animal animal: list) {
            System.out.println(animal.getClass().getSimpleName());
        }
    }
}