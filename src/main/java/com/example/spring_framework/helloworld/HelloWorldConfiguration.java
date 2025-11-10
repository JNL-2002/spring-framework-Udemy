package com.example.spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "안녕";
    }

    @Bean
    public int age() {
        return 24;
    }

    @Bean
    public Person person() {
        return new Person("박정환", 20);
    }
}
