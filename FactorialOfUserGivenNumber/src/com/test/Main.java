package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// find factorial of user given number
        Scanner input = new Scanner(System.in);
        System.out.println("Input any number");
        int num = input.nextInt();
        int factorial= 1 ;
        for (int i=1 ; i <= num ; i++){
            factorial = factorial * i;
        }
        System.out.println("factorial = "+ factorial);
    }
}
