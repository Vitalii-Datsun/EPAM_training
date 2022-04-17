package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanA;
import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanC;
import com.epam.spring.homework2.beans.BeanD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class OtherConfig {
    @Order(2)
    @Bean(initMethod = "initMethodBeanB",
            destroyMethod = "destroyMethodBeanB")
    public BeanB beanB() {
        return new BeanB();
    }
    @Order(3)
    @Bean(initMethod = "initMethodBeanC",
            destroyMethod = "destroyMethodBeanC")
    public BeanC beanC() {
        return new BeanC();
    }

    @Bean(initMethod = "initMethodBeanD",
            destroyMethod = "destroyMethodBeanD")
    @Order(1)
    public BeanD beanD() {
        return new BeanD();
    }
    @Bean
    public BeanA beanA() {
        return new BeanA(null, -3);
    }
}
