package internal.aricalot.learning;

public class Peformance {
    private String name;
    private int grade;
    private int roll;
    private float maths;
    private float nepali;
    private float english;

    public Peformance(String name, int grade, int roll, float maths, float nepali, float english) {
        this.name = name;
        this.grade = grade;
        this.roll = roll;
        this.maths = maths;
        this.nepali = nepali;
        this.english = english;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public float getMaths() {
        return maths;
    }

    public void setMaths(float maths) {
        this.maths = maths;
    }

    public float getNepali() {
        return nepali;
    }

    public void setNepali(float nepali) {
        this.nepali = nepali;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public String displayPeformanceOfStudents(){

            return ("Peformance of Student "+"\n"+
                    "Name : "+this.name+"\n"+
                    "Grade : "+this.grade+"\n"+
                    "Roll : "+this.roll+"\n"+
                    "Marks Obtained in Maths : "+this.maths+"\n"+
                    "Marks Obtained in Nepali : "+this.nepali+"\n"+
                    "Marks Obtained in English : "+this.english+"\n");

    }


}
