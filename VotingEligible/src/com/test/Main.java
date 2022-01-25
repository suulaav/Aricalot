package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Check eligible voting candidate (age being 18 for voting)
        Scanner input = new Scanner(System.in);
        System.out.println("what is your age ? ");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");

        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
}
