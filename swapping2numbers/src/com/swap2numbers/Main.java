package com.swap2numbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Swap 2 numbers without using 3rd variable
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        System.out.println("a = "+ a + " b = " +b);
        a = a + b;
        b= a - b;
        a =a - b;
        System.out.println( "after interchanging : "+"\n"+"a = "+ a + " b = " +b);
    }
}
