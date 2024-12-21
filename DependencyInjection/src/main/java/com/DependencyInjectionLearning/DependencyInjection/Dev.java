package com.DependencyInjectionLearning.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    public void build(){
        System.out.println("I am working on a great project");
    }
}