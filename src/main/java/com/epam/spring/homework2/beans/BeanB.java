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

    private void initMethodBeanB() {
        System.out.println("BeanB inside InitMethodBeanB()");
    }

    private void destroyMethodBeanB() {
        System.out.println("BeanB inside DestroyMethodBeanB()");
    }

    private void anotherInitMethod() {
        System.out.println("BeanB inside AnotherInitMethod()");
    }
}
