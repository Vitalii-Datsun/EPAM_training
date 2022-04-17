package com.epam.spring.homework2.another;

import com.epam.spring.homework2.beans.BeanB;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class ChangeBeanBInitMethodBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println(getClass().getSimpleName() + " is changing initMethod");
        configurableListableBeanFactory.getBeanDefinition("beanB").setInitMethodName("anotherInitMethod");
    }
}
