package internal.aricalot.learning;

public class Students {
    private String name;
    private int grade;
    private int roll;

   public Students(String name,int grade,int roll) {
        this.grade = grade;
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
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

    public String displayDetailsOfStudents(){

        return ("\nDetails of Student "+"\n"+
                "Name : "+this.name+"\n"+
                "Grade : "+this.grade+"\n"+
                "Roll : "+this.roll+"\n");
    }



}