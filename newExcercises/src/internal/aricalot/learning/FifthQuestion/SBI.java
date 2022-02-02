package internal.aricalot.learning.FifthQuestion;

import java.util.Scanner;

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


