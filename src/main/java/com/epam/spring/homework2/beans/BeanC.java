package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.annotations.Validation;
import org.springframework.beans.factory.annotation.Value;

@Validation
public class BeanC {
    @Value("${beanC.name}")
    private String name;
    @Value("${beanC.value}")
    private int value;

    @Override
    public String toString() {
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    private void initMethodBeanC() {
        System.out.println("BeanC inside InitMethodBeanC()");
    }

    private void destroyMethodBeanC() {
        System.out.println("BeanC inside DestroyMethodBeanC()");
    }
}
