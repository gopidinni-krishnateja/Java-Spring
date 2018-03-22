package com.springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld hello= (HelloWorld) app.getBean("helloworld");
        System.out.println("Your Message- "+hello.getMessage());
    }
}
