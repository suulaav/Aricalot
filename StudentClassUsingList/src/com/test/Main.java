package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{

    private String Names;
    private String School;
    private String DOB;
    private String Age;
    private String Class;
    private String Roll;


    Student(String Names, String School, String DOB, String Age, String Class, String Roll){
       this.Names=Names;
        this.School = School;
        this.DOB = DOB;
        this.Class = Class;
        this.Age = Age;
        this.Roll = Roll;
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
    public void setRoll(String Roll){
        this.Roll = Roll;
    }

    public String getRoll(){
       return this.Roll;
    }

    public void DisplayDetails(){
        System.out.println("Name: "+Names+"\n"+
                           "School: "+School+"\n"+
                           "DOB: "+DOB+"\n"+
                           "Age: "+Age+"\n"+
                           "Class: "+Class+"\n"+
                            "Roll: "+Roll+"\n");
    }

}

public class Main {

    public static void main(String[] args) {
        List<Student> Students = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true) {
           System.out.println("Input number on list to peform the operation"+"\n"+
                   "1.Add"+"\n"+
                   "2.View"+"\n"+
                   "3.Edit"+"\n"+
                   "4.Remove"+"\n"+
                   "0.Exit");
           int MenuUserInput = input.nextInt();
           if(MenuUserInput != 0){
               if (MenuUserInput == 1){
                   int i = 1;
                   System.out.println("How Many Students You Want to Add");
                   int count = input.nextInt();
                   while (i <= count) {
                       System.out.println("Input Name , School , DOB , Age ,Class,Roll respectively");

                       String Name = input.next();
                       String School = input.next();
                       String DOB = input.next();
                       String Age = input.next();
                       String Class = input.next();
                       String Roll = input.next();
                       Students.add(new Student(Name, School, DOB, Age, Class,Roll));
                       i = i + 1;
                   }
               }
               if (MenuUserInput == 2){
                   for(int i=0;i<Students.size();i++){
                       Students.get(i).DisplayDetails();
                       System.out.println("\n");
                   }
               }
               if (MenuUserInput == 3){
                   for(int i=0;i<Students.size();i++){
                       Students.get(i).DisplayDetails();
                       System.out.println("\n");
                   }
                   System.out.println("Which record do you want to edit enter roll number if you don't want to change value enter default");
                   String EditUserInput = input.next();
                   System.out.println("Input Name , School , DOB , Age ,Roll, Class respectively");
                   String Name = input.next();
                   String School = input.next();
                   String DOB = input.next();
                   String Age = input.next();
                   String Roll = input.next();
                   String Class = input.next();
                   for(int i=0;i<Students.size();i++){
                       String roll = Students.get(i).getRoll();
                       if (roll.equals(EditUserInput)){
                           if (!Age.equals("default")){
                           Students.get(i).setAge(Age);}

                           if (!Class.equals("default")){
                           Students.get(i).setClass(Class);}

                           if (!DOB.equals("default")){
                           Students.get(i).setDOB(DOB);}
                           if (!School.equals("default")){
                           Students.get(i).setSchool(School);}
                           if (!Name.equals("default")){
                           Students.get(i).setName(Name);}
                           if (!Roll.equals("default")){
                           Students.get(i).setRoll(Roll);}
                       }
                   }


                   for(int i=0;i<Students.size();i++){
                       Students.get(i).DisplayDetails();
                       System.out.println("\n");
                   }


               }
               if (MenuUserInput == 4){
                   for(int i=0;i<Students.size();i++){
                       Students.get(i).DisplayDetails();
                       System.out.println("\n");
                   }
                   System.out.println("Which record do you want to remove ?");
                   int EditUserInput = input.nextInt();
                   Students.remove(EditUserInput-1);
                   for(int i=0;i<Students.size();i++){
                       Students.get(i).DisplayDetails();
                       System.out.println("\n");
                   }
               }
           }
           else break;

       }
    }
}
