package internal.aricalot.learning.ThirdQuestion;


import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        int numOfInput = 5;
        Scanner input = new Scanner(System.in);
        SortedSet<Integer> numbers = new TreeSet<>();
        System.out.println("input 20 numbers");
        for (int i = 0; i < numOfInput; i++) {
            System.out.print("Number " + (i + 1) + ":");
            int userInput = input.nextInt();
            numbers.add(userInput);
        }
        System.out.println("largest number is :" + numbers.last());
        System.out.println("smallest number is :" + numbers.first());

    }
}
