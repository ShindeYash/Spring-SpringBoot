package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dev {

    private Laptop lapObj;

    // Constructor Injection Object
    private Laptop lapObj2;

    // Consturctor
    public Dev(Laptop lap){
        this.lapObj2 = lap;
    }

    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void build(){
        System.out.println("I am building something great.");

        System.out.print("Setter Injection : "); lapObj.compile();

        System.out.print("Constructor Injection : "); lapObj2.compile();
    }

    public Laptop getLapObj() {
        return lapObj;
    }

    public void setLapObj(Laptop lapObj) {
        this.lapObj = lapObj;
    }

    public void setLapObj2(Laptop lapObj2) {
        this.lapObj2 = lapObj2;
    }
}
