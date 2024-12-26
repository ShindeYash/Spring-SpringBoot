package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dev {

    private int age;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev(){
        System.out.println("Dev Constructor Created");
    }

    public Dev(int age){
        System.out.println("Called Parameterized Constructor for Setter Injection");
        this.age = age;
    }

    public Dev(int age, int salary){
        System.out.println("Called Dueled Parameterized Constructor for Setter Injection");
        this.age = age;
        this.salary = salary;
    }

    public void build(){
        System.out.println("I am building something great.");
    }
}
