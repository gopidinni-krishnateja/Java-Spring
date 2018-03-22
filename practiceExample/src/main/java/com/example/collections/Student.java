package com.example.collections;

public class Student extends Person{
    public int id;
    public double englishMarks;
    public double mathsMarks;
    public double physicsMarks;
    public double chemistryMarks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(double englishMarks) {
        this.englishMarks = englishMarks;
    }

    public double getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(double mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public double getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysicsMarks(double physicsMarks) {
        this.physicsMarks = physicsMarks;
    }

    public double getChemistryMarks() {
        return chemistryMarks;
    }

    public void setChemistryMarks(double chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }

    public void inIt(){
        System.out.println("Calling In it method");
    }
    public void destroy(){
        System.out.println("Calling Destroy Method");
    }
}
