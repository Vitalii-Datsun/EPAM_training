package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.annotations.Validation;
import org.springframework.beans.factory.annotation.Value;

@Validation
public class BeanD {
    @Value("${beanD.name}")
    private String name;
    @Value("${beanD.value}")
    private int value;

    @Override
    public String toString() {
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    private void initMethodBeanD() {
        System.out.println("BeanD inside InitMethodBeanD()");
    }

    private void destroyMethodBeanD() {
        System.out.println("BeanD inside DestroyMethodBeanD()");
    }
}
