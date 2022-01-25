package com.test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        HashMap<Integer , String> Names = new HashMap<>();
        Names.put(1, "asd");
        Names.put(2,"dsa");
        Names.put(3,"qwe");
        Names.put(4,"ewq");
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
                    Names.put(Names.size()+1,NewName);
                    for(int i=1;i<=Names.size();i++) System.out.println(i+"."+Names.get(i));

                }


                if(MenuNavigation == 2) {
                    System.out.println("Input number you want to edit and number you want to edit to:");
                    for (int i = 1; i <= Names.size(); i++) System.out.println(i + "." + Names.get(i));
                    int UserInputKey = input.nextInt();
                    String UserInputValue = input.next();
                    Names.replace(UserInputKey, UserInputValue);
                    for (int i = 1; i <= Names.size(); i++) System.out.println(i + "." + Names.get(i));
                }

                if(MenuNavigation == 3) {
                    for(int i=1;i<=Names.size();i++){
                        System.out.println(i+"."+Names.get(i));
                    }
                }


                if(MenuNavigation == 4){
                    int NewName = input.nextInt();
                    Names.remove(NewName);
                    for(int i=1;i<=Names.size();i++) System.out.println(i+"."+Names.get(i));
                }



            }
            else break;
        }
    }
}
