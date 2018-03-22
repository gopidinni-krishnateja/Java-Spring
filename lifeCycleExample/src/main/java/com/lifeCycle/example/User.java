package com.lifeCycle.example;

import java.io.IOException;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void inIt() throws IOException{
        System.out.println("In It Method has Called");
    }

    private void destroy() throws IOException{
        System.out.println("Destroy method has called");
    }
}