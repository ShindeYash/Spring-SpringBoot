package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dev {

    private Computer lap;


    public void build(){
        System.out.println("I am building something great.");

        System.out.print("Setter Injection : ");

        lap.compile();

    }

    public Computer getLap() {
        return lap;
    }

    public void setLap(Computer lapObj) {
        this.lap = lapObj;
    }
}
