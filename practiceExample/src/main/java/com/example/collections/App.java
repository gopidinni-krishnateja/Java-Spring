package com.example.collections;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class App {
    public static void main(String []args){
        ConfigurableApplicationContext app=new ClassPathXmlApplicationContext("studentConfiguration.xml");
        Student std=(Student) app.getBean("student");
        StudentData cal=new StudentData();
        cal.addStudent(std);
        Student student = (Student) app.getBean("student1");
        student.setName("Teja");
        student.setId(2);
        student.setAge(25);
        student.setEnglishMarks(86.5);
        student.setMathsMarks(67.7);
        student.setPhysicsMarks(76.3);
        student.setChemistryMarks(98);
        cal.addStudent(student);
        System.out.println("Total Student List----->");
        cal.StudentsList();
       System.out.println("----------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Student Id to calculate total Marks");
        int id=sc.nextInt();
        cal.calculatePercentage(id);
        app.close();
    }

}
