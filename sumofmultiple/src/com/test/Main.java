package com.test;

public class Main {

    public static void main(String[] args) {
	// sum of multiple of 3 from 1 to 100
       int multiplicationOf3 , count = 0;
        for(int i = 1;i<=100;i++){
            if((i % 3) == 0){
//            multiplicationOf3 = 3 * i;
            count = count + i;
        }

    }
        System.out.println(count);
}}
