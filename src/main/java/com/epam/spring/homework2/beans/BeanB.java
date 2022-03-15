package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.annotations.Validation;
import org.springframework.beans.factory.annotation.Value;

@Validation
public class BeanB {
    @Value("${beanB.name}")
    private String name;
    @Value("${beanB.value}")
    private int value;

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public void initMethodBeanB() {
        System.out.println("BeanB inside InitMethodBeanB()");
    }

    public void destroyMethodBeanB() {
        System.out.println("BeanB inside DestroyMethodBeanB()");
    }

    public void anotherInitMethod() {
        System.out.println("BeanB inside AnotherInitMethod()");
    }
}
