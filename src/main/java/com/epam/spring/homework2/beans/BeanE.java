package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.annotations.Validation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Validation
public class BeanE {
    @Value("Sergey")
    private String name;
    @Value("2")
    private int value;

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("BeanE inside @PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("BeanE inside @PreDestroy");
    }
}
