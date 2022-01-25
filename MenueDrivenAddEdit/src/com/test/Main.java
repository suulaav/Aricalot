package com.test;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//store name in data structure of your choice and provide user menu driven cli program to add, edit , view and delete names
    Scanner input = new Scanner(System.in);

    ArrayList<String> Names= new ArrayList<>();
        Names.add("asd");
        Names.add("dsa");
        Names.add("qwe");
        Names.add("ewq");
    while(true){
        System.out.println("\n");
        System.out.println("Press given numbers to peform taske :" +"\n"+
                "1. ADD "+"\n"+
                "2. Edit"+"\n"+
                "3. View"+"\n"+
                "4. Delete"+"\n"+
                "0. Exit"+"\n");
        int MenuNavigation = input.nextInt();
        if(MenuNavigation != 0){
            if(MenuNavigation == 1) {
                String add = input.next();
                Names.add(add);
            }
            if(MenuNavigation == 2){
                System.out.println("Which Value Do you want to Edit?");

                for(int i=0;i< Names.size();i++){
                    System.out.println(i+"."+Names.get(i));
                }
                int UserInput = input.nextInt();
                System.out.println("what do you want change "+Names.get(UserInput)+ " to ?");
                String EditInput = input.next();

                Names.set(UserInput,EditInput);

                for(int i=0;i< Names.size();i++){
                    System.out.println(i+"."+Names.get(i));
                }
            }
            if(MenuNavigation == 3) {
                for(int i=0;i< Names.size();i++){
                System.out.println(Names.get(i));
                }
            }
            if(MenuNavigation == 4) {
                System.out.println("Which Value Do you want to Delete?");

                for(int i=0;i< Names.size();i++){
                    System.out.println(i+"."+Names.get(i));
                }
                int UserInput = input.nextInt();
                Names.remove(UserInput);

                for(int i=0;i< Names.size();i++){
                    System.out.println(i+"."+Names.get(i));
                }
            }
        }
        else break;
    }

    }}
