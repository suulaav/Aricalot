package com.test;


import javax.naming.Name;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        Set<String> Names= new HashSet<>();
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
                if(MenuNavigation == 1)  {
                    String NewName = input.next();
                    Names.add(NewName);
                }

                if(MenuNavigation == 2){
                    System.out.println("Input name you want to remove and new name you want to add");

                    int count=0;
                    Iterator<String> iterate = Names.iterator();
                    while (iterate.hasNext()) {
                        count= count+1;
                        System.out.print(count+ "." +iterate.next());
                        System.out.print("\n");
                    }

                    String Name = input.next();
                    Names.remove(Name);

                    String NewName = input.next();
                    Names.add(NewName);

                    Iterator<String> iterate1 = Names.iterator();
                    int count1=0;
                    while (iterate1.hasNext()) {
                        count1= count1+1;
                        System.out.print(count1+ "." +iterate1.next());
                        System.out.print("\n");
                    }
                }


                if(MenuNavigation == 3) {

                    Iterator<String> iterate = Names.iterator();
                    int count=0;
                    while (iterate.hasNext()) {
                        count= count+1;
                        System.out.print(count+ "." +iterate.next());
                        System.out.print("\n");
                    }
                }
                if(MenuNavigation == 4) {
                    String Name = input.next();
                    Names.remove(Name);
                    int count=0;
                    Iterator<String> iterate = Names.iterator();
                    while (iterate.hasNext()) {
                        count= count+1;
                        System.out.print(count+ "." +iterate.next());
                        System.out.print("\n");
                    }


                }

            }
            else break;
        }
    }
}
