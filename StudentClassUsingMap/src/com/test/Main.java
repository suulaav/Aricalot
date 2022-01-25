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

    public static void main(String[] args) {
        HashMap<Integer,Student> Students = new HashMap<>();
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


                    System.out.println("How many inputs ?");
                    int count = input.nextInt();



                    for(int i = 0;i< count;i++){
                            System.out.println("Input Name , School , DOB , Age , Class respectively");
                            String Name = input.next();
                            String School = input.next();
                            String DOB = input.next();
                            String Age = input.next();
                            String Class = input.next();
                        Students.put(i,new Student(Name, School, DOB, Age, Class));
                        }
                        for (int i=0;i<Students.size();i++) {

                        Students.get(i).DisplayDetails();
                        }


                }
                if (MenuUserInput == 2){
                    for (int i=0;i<Students.size();i++) {

                        Students.get(i).DisplayDetails();
                    }
                }
                if (MenuUserInput == 3){
                    for(int i=0;i<Students.size();i++){
                        Students.get(i).DisplayDetails();
                        System.out.println("\n");
                    }
                    System.out.println("Which record do you want to edit ?");
                    int EditUserInput = input.nextInt();
                    System.out.println("Input Name , School , DOB , Age , Class respectively");
                    String Name = input.next();
                    String School = input.next();
                    String DOB = input.next();
                    String Age = input.next();
                    String Class = input.next();
                    Students.get(EditUserInput-1).setAge(Age);
                    Students.get(EditUserInput-1).setClass(Class);
                    Students.get(EditUserInput-1).setDOB(DOB);
                    Students.get(EditUserInput-1).setSchool(School);
                    Students.get(EditUserInput-1).setName(Name);

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
                    Students.remove(EditUserInput);
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