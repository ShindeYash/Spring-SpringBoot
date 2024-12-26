package com.yash.simpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//public class HomeController {
//
//    @RequestMapping("/")
//    @ResponseBody
//    public String greet(){
//        System.out.println("I am Here");
//        return "This is Home Page";
//    }
//
//}

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        System.out.println("I am Here");
        return "This is Home Page";
    }

    @RequestMapping("/about")
    public String about(){
        return "We are best Software Professional in the World.";
    }
}
