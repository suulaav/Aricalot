package internal.aricalot.learning.FifthQuestion;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name :");
        String name = input.next();
        System.out.print("accountNum");
        int accountNum = input.nextInt();
        System.out.print("balance");
        float balance = input.nextFloat();
        Customer customer1 = new Customer();
        customer1.setBalance(balance);
        customer1.setAccountNum(accountNum);
        customer1.setName(name);
        System.out.print("which bank do you want to see intrest rate ?\n 1.SBI \n 2.ICICI \n 3.PNB ");
        int menuNum = input.nextInt();
        if (menuNum == 1) {
            SBI newSbi = new SBI();
            System.out.println("For how many years?");
            int time = input.nextInt();
            System.out.print("SBI intrest rate is " + newSbi.getIntrest());

            System.out.print(" Your balance will be  " + (customer1.getBalance() + ((customer1.getBalance() * newSbi.getIntrest() * time) / 100)));
        } else if (menuNum == 2) {
            ICICI newICICI = new ICICI();
            System.out.print("For how many years?");
            int time = input.nextInt();
            System.out.print("SBI intrest rate is " + newICICI.getIntrest());
            System.out.print(" Your balance will be  " + (customer1.getBalance() + ((customer1.getBalance() * newICICI.getIntrest() * time) / 100)));
        } else if (menuNum == 3) {
            PNB newPNB = new PNB();
            System.out.print("For how many years?");
            int time = input.nextInt();
            System.out.print("SBI intrest rate is " + newPNB.getIntrest());
            System.out.print(" Your balance will be  " + (customer1.getBalance() + ((customer1.getBalance() * newPNB.getIntrest() * time) / 100)));

        }
    }
}