package internal.aricalot.learning.FifthQuestion;

class ICICI extends RBI {
    float iciciIntrest = 6;

    public float getIntrest() {
        return iciciIntrest;
    }

    public void setIntrest(float iciciIntrest) {
        if (iciciIntrest > intrest) {
            this.iciciIntrest = iciciIntrest;
        } else {
            System.out.println("you have input intrest rate lower than mandated by RBI");
        }
    }
}
