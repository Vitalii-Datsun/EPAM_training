package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.annotations.Validation;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


@Validation
public class BeanA implements InitializingBean, DisposableBean {
    private String name;
    private int value;

    public BeanA(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanA inside InitializingBean.afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanA inside DisposableBean.destroy()");
    }
}
