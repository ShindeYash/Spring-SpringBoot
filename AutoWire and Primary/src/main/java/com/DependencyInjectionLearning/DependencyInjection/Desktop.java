package com.DependencyInjectionLearning.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    @Override
    public void compile(){
        System.out.println("Successfully compiled the code. But with the desktop");
    }
} 