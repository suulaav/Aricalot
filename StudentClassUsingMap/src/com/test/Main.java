package com.test;


import java.util.HashMap;
import java.util.Scanner;

class Student{

    private String Names;
    private String School;
    private String DOB;
    private String Age;
    private String Class;


    Student(String Names, String School, String DOB, String Age, String Class){
        this.Names=Names;
        this.School = School;
        this.DOB = DOB;
        this.Class = Class;
        this.Age = Age;
    }


    public void setName(String Names){
        this.Names = Names;
    }
    public void setSchool(String School){
        this.School = School;
    }
    public void setDOB(String DOB){
        this.DOB = DOB;
    }
    public void setClass(String Class){
        this.Class = Class;
    }
    public void setAge(String Age){
        this.Age = Age;
    }
    public void DisplayDetails(){
        System.out.println("Name: "+Names+"\n"+
                "School: "+School+"\n"+
                "DOB: "+DOB+"\n"+
                "Age: "+Age+"\n"+
                "Class: "+Class+"\n");
    }

}

public class Main {
