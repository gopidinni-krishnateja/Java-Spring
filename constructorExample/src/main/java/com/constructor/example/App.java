package com.constructor.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] arges){
        ApplicationContext app= new ClassPathXmlApplicationContext("beans.xml");
        Student std=(Student) app.getBean("student1");
        std.display();
        Student student=(Student) app.getBean("student2");
        student.display();
        Student student1 = (Student) app.getBean("student");

    }
}
