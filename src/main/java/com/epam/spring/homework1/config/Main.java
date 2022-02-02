package com.epam.spring.homework1.config;

import com.epam.spring.homework1.pet.Pet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfig.class);
        Pet pet = ctx.getBean("pet", Pet.class);
        pet.printPets();
    }
}
