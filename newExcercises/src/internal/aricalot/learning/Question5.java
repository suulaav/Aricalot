package internal.aricalot.learning;

import java.util.Scanner;

class RBI{
    float intrest = 4;

    public float getRbiIntrest() {
        return intrest;
    }

    public void setRbiIntrest(float intrest) {
        this.intrest = intrest;
    }
}
class SBI extends RBI{
    float sbiIntrest=7;

    public float getIntrest() {
        return sbiIntrest;
    }

    public void setIntrest(float sbiIntrest) {
        if(sbiIntrest>intrest){
            this.sbiIntrest = sbiIntrest;
        }
        else {
            System.out.println("you have input intrest rate lower than mandated by RBI");
        }
    }
}
class ICICI extends RBI{
    float iciciIntrest=6;

    public float getIntrest() {
        return iciciIntrest;
    }

    public void setIntrest(float iciciIntrest) {
        if(iciciIntrest>intrest) {
            this.iciciIntrest = iciciIntrest;
        }
        else {
            System.out.println("you have input intrest rate lower than mandated by RBI");
        }
    }
}
class PNB extends RBI{
    float pnbIntrest=9;

    public float getIntrest() {
        return pnbIntrest;
    }

    public void setIntrest(float pnbIntrest) {
        if(pnbIntrest>intrest) {
            this.pnbIntrest = pnbIntrest;
        }
        else {
            System.out.println("you have input intrest rate lower than mandated by RBI");
        }
    }
}

class Customer{
    private String name;
    private int accountNum;
    private float balance;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }



}
public class Question5 {
    static void num5() {
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
        if(menuNum == 1){
            SBI newSbi = new SBI();
            System.out.println("For how many years?");
            int time = input.nextInt();
            System.out.print("SBI intrest rate is "+ newSbi.getIntrest());

            System.out.print(" Your balance will be  "+ (customer1.getBalance()+((customer1.getBalance()* newSbi.getIntrest()*time)/100)));
        }
        else if(menuNum == 2){
            ICICI newICICI = new ICICI();
            System.out.print("For how many years?");
            int time = input.nextInt();
            System.out.print("SBI intrest rate is "+ newICICI.getIntrest());
            System.out.print(" Your balance will be  "+ (customer1.getBalance()+((customer1.getBalance()* newICICI.getIntrest()*time)/100)));
        }
        else if(menuNum == 3){
            PNB newPNB = new PNB();
            System.out.print("For how many years?");
            int time = input.nextInt();
            System.out.print("SBI intrest rate is "+ newPNB.getIntrest());
            System.out.print(" Your balance will be  "+ (customer1.getBalance()+((customer1.getBalance()* newPNB.getIntrest()*time)/100)));
        }

    }

}
