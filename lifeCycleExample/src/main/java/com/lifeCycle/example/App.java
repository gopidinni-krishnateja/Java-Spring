package com.lifeCycle.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ConfigurableApplicationContext con =new ClassPathXmlApplicationContext("applicationContext.xml");
        User user=(User) con.getBean("user");
        user.setName("Singleton --->This is Krishna");
        System.out.println(user.getName());
        User user1=(User) con.getBean("user");
        System.out.println(user1.getName());

        ConfigurableApplicationContext app= new ClassPathXmlApplicationContext("applicationContext.xml");
        User person= (User) app.getBean("person");
        person.setName("Prototype --->This is Teja");
        System.out.println(person.getName());
        User person2 = (User) con.getBean("person");
        System.out.println(person2.getName());
        app.close();
        con.close();
    }
}
