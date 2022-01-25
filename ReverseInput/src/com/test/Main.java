package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//reverse the user given number
        String reverse = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Input any number :");
        String USERINPUT = input.next();
        System.out.println(USERINPUT);
        for(int i = (USERINPUT.length()-1); i>=0;i--){
        reverse = reverse + USERINPUT.charAt(i);
        }
        System.out.println("reverse:"+reverse);

    }
}
