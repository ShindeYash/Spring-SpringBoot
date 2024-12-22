package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Dev devObj = (Dev) context.getBean("Dev");

        // This is way to access Properties using getter and setter
        devObj.setAge(23);
        System.out.println(devObj.getAge());

        // Accessing properties using spring.xml Configuration
        Dev dev1 = (Dev) context.getBean("Dev1");
        System.out.println(dev1.getAge()); // Getting 12 from Dev1 Objects Configuration using property tag.

        // Using the Setter Injection
        Dev dev2 = (Dev) context.getBean("Dev2");
        System.out.println(dev2.getAge());  // Getting 99 from the Dev2 Objects Configuration.

        // Using the 2 Parameter Setter Injection
        Dev dev3 = (Dev) context.getBean("Dev3");
        System.out.println("age : " + dev3.getAge() + " salary : " + dev3.getSalary());  // Getting 99 from the Dev2 Objects Configuration.
    }
}
