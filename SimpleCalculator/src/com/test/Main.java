package com.test;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input your expression :");


          String userInput = Input.next();

           String numbers = "0 1 2 3 4 5 6 7 8 9";
           ArrayList<String> Divided = new ArrayList<>();

           String container = "";
           for (int i = 0; i < userInput.length(); i++) {

               if (numbers.contains(String.valueOf(userInput.charAt(i)))) {
                   container = container + userInput.charAt(i);

               } else {

                   Divided.add(container);
                   container = "";
                   Divided.add(String.valueOf(userInput.charAt(i)));
               }

           }
           Divided.add(container);
           float result = Float.parseFloat(Divided.get(0));

           for (int i = 1; i < Divided.size(); i++) {
               if (Divided.get(i).equals("+")) {
                   result = result + Float.parseFloat(Divided.get(i + 1));
               }
               if (Divided.get(i).equals("-")) {
                   result = result - Float.parseFloat(Divided.get(i + 1));
               }
               if (Divided.get(i).equals("*")) {
                   result = result * Float.parseFloat(Divided.get(i + 1));
               }
               if (Divided.get(i).equals("/")) {
                   result = result / Float.parseFloat(Divided.get(i + 1));
               }
           }
           System.out.println(result);

       }



    }

