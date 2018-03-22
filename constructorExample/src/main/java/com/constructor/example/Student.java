package com.constructor.example;

public class Student {
    private int roll;
    private String name;
    private int age;
    private double marks;


    public Student(String name, int roll){
        this.name=name;
        this.roll=roll;

    }
   public Student(int roll,String name, int age,double marks){
        this.roll=roll;
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public void display(){
        System.out.println("Roll->"+this.roll);
        System.out.println("Name->"+this.name);
        System.out.println("Age->"+this.age);
        System.out.println("Marks->"+this.marks);
    }
    public Student(){
        System.out.println("default Constructor");
    }
}
