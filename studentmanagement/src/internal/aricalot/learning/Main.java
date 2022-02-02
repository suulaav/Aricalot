package internal.aricalot.learning;

import java.util.*;

class Student {

    private String Names;
    private String School;
    private String DOB;
    private String Age;
    private String Class;
    private int Maths;
    private int English;
    private int Nepali;


    Student(String Names, String School, String DOB, String Age, String Class,int English , int Nepali , int Maths) {
        this.Names = Names;
        this.School = School;
        this.DOB = DOB;
        this.Class = Class;
        this.Age = Age;
        this.Nepali= Nepali;
        this.English=English;
        this.Maths=Maths;
    }


    public void setName(String Names) {
        this.Names = Names;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public void setMaths(int Maths) {
        this.Maths = Maths;
    }

    public void setNepali(int Nepali) {
        this.Nepali = Nepali;
    }

    public void setEnglish(int English) {
        this.English = English;
    }
    public String gettClass() {
        String Class = this.Class;

        return Class;
    }


    public float getGrade() {
        float grades = ((this.Maths * this.English * this.Nepali)/300)*100;

        return grades;
    }


    public void DisplayDetails() {
        System.out.println("Name: " + Names + "\n" +
                "School: " + School + "\n" +
                "DOB: " + DOB + "\n" +
                "Age: " + Age + "\n" +
                "Class: " + Class + "\n"+
                "Maths: " + Maths + "\n"+
                "Nepali: " + Nepali + "\n"+
                "English: " + English + "\n");
    }

}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        ArrayList<Student> StudentsArray = new ArrayList<>();

        Map<String, List<Student>> studentClass = new HashMap();
//        Map<Integer, List> studentPeformance = new HashMap();
        System.out.println("How entries are you updating");
        int numberofentry = input.nextInt();
        for (int i = 0; i < numberofentry; i++) {
            System.out.println("Input Name , School , DOB , Age , Class and marks obtained in English , Nepali , Maths respectively");
//        StudentsArray.add(0,new Student("st1","lms","birthday","age1","1",1 , 1, 1));
//        StudentsArray.add(1,new Student("st2","lms2","birthday2","age2","1",2 , 2, 2));
//        StudentsArray.add(2,new Student("st3","lms3","birthday3","age3","2",3 , 3, 3));
//        StudentsArray.add(3,new Student("st4","lms4","birthday4","age4","2",4 , 4, 4));
//        StudentsArray.add(4,new Student("st5","lms5","birthday5","age5","3",4 , 4, 4));
            String Name = input.next();
            String School = input.next();
            String DOB = input.next();
            String Age = input.next();
            String Class = input.next();
            int English = input.nextInt();
            int Nepali = input.nextInt();
            int Maths = input.nextInt();

            if (studentClass.get(Class) == null) {
                List<Student> students = new ArrayList<>();
                for (int j = 1; j <= 5; j++) {
                    Student student = new Student(Name, School, DOB, Age, Class, English, Nepali, Maths);
                    students.add(student);
                }
                studentClass.put(Class, students);
            } else {
                List<Student> exitingStudents = studentClass.get(Class);
                for (int k = 1; k <= 2; k++) {
                    Student student = new Student(Name, School, DOB, Age, Class, English, Nepali, Maths);
                    exitingStudents.add(student);
                }
                studentClass.put(Class, exitingStudents);
            }
        }




        System.out.println("What grade value do you want to view ? ");
        String classValue = input.next();
        studentClass.get(classValue).get(Integer.parseInt(classValue)).DisplayDetails();

        System.out.println("Do You want to update any grade y/n ?");
        String yesno = input.next();
        if(yesno.equals("y")){
            System.out.println("what grade  do you want to update?");
            String grade = input.next();
            System.out.println("what index student you want to update ?");
            String index = input.next();
            System.out.println("Input Name , School , DOB , Age , Class and marks obtained in English , Nepali , Maths respectively");
            String Name = input.next();
            String School = input.next();
            String DOB = input.next();
            String Age = input.next();
            String Class = input.next();
            int English = input.nextInt();
            int Nepali = input.nextInt();
            int Maths = input.nextInt();

            studentClass.get(grade).get(Integer.parseInt(index)).setClass(Class);
            studentClass.get(grade).get(Integer.parseInt(index)).setAge(Age);
            studentClass.get(grade).get(Integer.parseInt(index)).setDOB(DOB);
            studentClass.get(grade).get(Integer.parseInt(index)).setName(Name);
            studentClass.get(grade).get(Integer.parseInt(index)).setSchool(School);
            studentClass.get(grade).get(Integer.parseInt(index)).setEnglish(English);
            studentClass.get(grade).get(Integer.parseInt(index)).setNepali(Nepali);
            studentClass.get(grade).get(Integer.parseInt(index)).setMaths(Maths);


        }

    }




}

















