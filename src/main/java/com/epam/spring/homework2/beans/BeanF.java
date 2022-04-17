package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.annotations.Validation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Validation
public class BeanF {
    @Value("Vlad")
    private String name;
    @Value("3")
    private int value;

    @Override
    public String toString() {
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
