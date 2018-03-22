package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentData {
    ArrayList<Student> list=new ArrayList<Student>();
    public void addStudent(Student std){
        list.add(std);
    }
    public void StudentsList(){
       for(int i=0;i<list.size();i++){
           System.out.println("Id-> "+list.get(i).id);
           System.out.println("Name-> "+list.get(i).name);
           System.out.println("Age-> "+list.get(i).age);
           System.out.println("English-> "+list.get(i).englishMarks);
           System.out.println("Maths-> "+list.get(i).mathsMarks);
           System.out.println("Physics-> "+list.get(i).physicsMarks);
           System.out.println("Chemistry-> "+list.get(i).chemistryMarks);

       }
    }


    public void calculatePercentage(int id){
         Double totalMarks=0.0;
         boolean isStudentFound=false;
        for(int i=0;i<list.size();i++){
            if(list.get(i).id==id){
                System.out.println("Inside Id-> "+list.get(i).id);
                totalMarks=((list.get(i).englishMarks+list.get(i).chemistryMarks+list.get(i).physicsMarks+list.get(i).mathsMarks)/400)*100;
                isStudentFound=true;
            } else {
                isStudentFound=false;
            }
        }
        if(isStudentFound)
        System.out.println("Total Marks Percent------> "+totalMarks);
        else
            System.out.println("No Student Found With This Id");
    }


}
