package internal.aricalot.learning.FifthQuestion;

class PNB extends RBI {
    float pnbIntrest = 9;

    public float getIntrest() {
        return pnbIntrest;
    }

    public void setIntrest(float pnbIntrest) {
        if (pnbIntrest > intrest) {
            this.pnbIntrest = pnbIntrest;
        } else {
            System.out.println("you have input intrest rate lower than mandated by RBI");
        }
    }
}
