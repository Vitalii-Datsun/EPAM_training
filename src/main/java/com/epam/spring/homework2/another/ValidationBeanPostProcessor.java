package com.epam.spring.homework2.another;

import com.epam.spring.homework2.annotations.Validation;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class ValidationBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(Validation.class)) {
            Field[] fields = bean.getClass().getDeclaredFields();
            for (Field field : fields) {
                try {
                    if (field.getName().equals("name")) {
                        field.setAccessible(true);
                        String name = (String) field.get(bean);
                        if (name == null) {
                            System.out.println(bean.getClass() + ". Name can not be null");
                        }
                    }
                    if (field.getName().equals("value")) {
                        field.setAccessible(true);
                        Integer value = (Integer) field.get(bean);
                        if (value < 0) {
                            System.out.println(bean.getClass() + ". Value can not be less than zero");
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return bean;
    }
}
