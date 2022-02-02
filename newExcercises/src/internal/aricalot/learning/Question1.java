package internal.aricalot.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    static void num1(){
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("input 20 numbers");
        int positiveNumbers = 0;
        int negativeNumbers =0;
        for (int i=0;i<20;i++){
            System.out.print("Number "+ (i+1) +":");
            int userInput = input.nextInt();
            numbers.add(userInput);
        }

        //Positive numbers
        System.out.println("Positive numbers are : \n");

        for(int i = 0 ; i<numbers.size() ; i++){
            if(numbers.get(i)>0){
                System.out.println(numbers.get(i));
                positiveNumbers++;
            }

        }
        System.out.print("number of positive numbers are :"+ positiveNumbers+"\n");
        //Negative Numbers
        System.out.println("Negative numbers are : \n");
        for(int i = 0 ; i<numbers.size() ; i++){
            if(numbers.get(i)<0){
                System.out.println(numbers.get(i));
                negativeNumbers++;
            }
        }
        System.out.print("number of negative numbers are :"+ negativeNumbers+"\n");

        //Odd Numbers
        int Odd=0;
        System.out.println("Odd numbers are : \n");
        for(int i = 0 ; i<numbers.size() ; i++){
            if(numbers.get(i)%2 != 0){
                System.out.println(numbers.get(i));
                Odd++;
            }
        }
        System.out.print("number of Odd numbers are :"+ Odd+"\n");
        //Even Numbers
        int Even = 0;
        System.out.println("Even numbers are : \n");
        for(int i = 0 ; i<numbers.size() ; i++){
            if(numbers.get(i)%2 == 0){
                System.out.println(numbers.get(i));
                Even++;
            }
        }
        System.out.print("number of Even numbers are :"+ Even+"\n");
        int zero = 0;
        for(int i = 0 ; i<numbers.size() ; i++){
            if(numbers.get(i) == 0){
                System.out.println(numbers.get(i));
                zero++;
            }
        }
        System.out.print("number of zero numbers are :"+ zero+"\n");
    }
}
