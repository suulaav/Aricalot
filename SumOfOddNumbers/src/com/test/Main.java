package com.test;

public class Main {

    public static void main(String[] args) {
	// sum of odd number from 1 to 100
        int count = 0;
        for (int i = 1 ; i<=100 ; i++){
            if((i%2)!=0){
                count = count + i;
            }
        }
    System.out.println(count);
    }
}
