package com.DependencyInjectionLearning.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Laptop{
    public void compile(){
        System.out.println("Successfully compiled the code.");
    }
}