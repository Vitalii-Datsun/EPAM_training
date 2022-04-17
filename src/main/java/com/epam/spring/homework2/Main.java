package com.epam.spring.homework2;

import com.epam.spring.homework2.config.BeansConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static final String LINE_SEPARATOR = "----------------------------------";

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);

        System.out.println("Application is configured and ready to be used");

        System.out.println(LINE_SEPARATOR);
        System.out.println("Bean names:  ");

        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(context.getBean(beanName));
        }

        System.out.println(LINE_SEPARATOR);

        System.out.println("Application is due to be closed");

        context.close();


    }
}
