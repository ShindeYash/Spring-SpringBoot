package com.DependencyInjectionLearning.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // Field injection //
    
    
    @Autowired   
    Computer myLaptop;
    

    // Constructor injection //

    /*
    Laptop myLaptop;

    @Autowired
    Dev(Laptop lapObj){
        this.myLaptop = lapObj; 
    }
    */

   // Setter Injection

    /*
   Laptop myLaptop;

   @Autowired
   void setMyLaptop(Laptop lapObj){
        this.myLaptop = lapObj;
   }
    */


    public void build(){
        
        myLaptop.compile();
        System.out.println("I am working on a great project");
    }
}