package com.epam.spring.homework2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.epam.spring.homework2.another", "com.epam.spring.homework2.beans"})
@Import(OtherConfig.class)
@PropertySource("classpath:values.properties")
public class BeansConfig {
}
