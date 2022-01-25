package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// take user input and print which day it is
        String[] days = {"Sunday" , "Monday", "Tuesday","Wednesday","Thursday", "Friday","Saturday"};
        Scanner input = new Scanner(System.in);
        System.out.println("Input number between 1 to 7 ");
        int day = input.nextInt();
        if (day >=1 && day <=7){

            System.out.println(days[day-1]);

        }
        else{
            System.out.println("wrong input");
        }
    }
}
