package internal.aricalot.learning;

import java.util.*;

class Student {

    private String Names;
    private String School;
    private String DOB;
    private String Age;
    private String Class;
    private String Roll;


    Student(String Names, String School, String DOB, String Age, String Class,String Roll) {
        this.Names = Names;
        this.School = School;
        this.DOB = DOB;
        this.Class = Class;
        this.Age = Age;
        this.Roll = Roll;
    }

    //setter

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

    public void setRoll(String Roll) {
        this.Roll = Roll;
    }

    //getter


    public String getName() {
      return  this.Names ;
    }

    public String getSchool(String School) {
       return this.School ;
    }

    public String getDOB(String DOB) {
        return this.DOB;
    }

    public String getClass(String Class) {
       return this.Class;
    }

    public String getAge(String Age) {
        return this.Age;
    }
    public String getRoll(String Roll) {
        return this.Roll = Roll;
    }




    public void DisplayDetails() {
        System.out.println("Name: " + Names + "\n" +
                "School: " + School + "\n" +
                "DOB: " + DOB + "\n" +
                "Age: " + Age + "\n" +
                "Class: " + Class + "\n"+
                "Roll: " + Roll + "\n");
    }

}
class Peformance {
    private String Names;
    private String Class;
    private String Roll;
    private float Nepali;
    private float English;
    private float Maths;

    Peformance(String Names,String Class,String Roll,float Nepali , float English , float Maths){
        this.Names = Names;
        this.Class = Class;
        this.Maths = Maths;
        this.English = English;
        this.Nepali = Nepali;
        this.Roll = Roll;
    }

    //setter

    public void setName(String Names) {
        this.Names = Names;
    }
    public void setClass(String Class) {
        this.Class = Class;
    }
    public void setRoll(String Roll) {
        this.Roll = Roll;
    }

    public void setEnglish(float English) {
        this.English = English;
    }
    public void setNepali(float Nepali) {
        this.Nepali = Nepali;
    }
    public void setMaths(float Maths) {
        this.Maths = Maths;
    }




    //getter

    public String getName() {
        return  this.Names ;
    }
    public String getClass(String Class) {
        return this.Class;
    }
    public String getRoll(String Roll) {
        return this.Roll = Roll;
    }
    public float getMaths(float Maths) {
        return this.Maths;
    }
    public float getNepali(float Nepali) {
        return this.Nepali;
    }

    public float getEnglish(float English) {
        return this.English;
    }
    public void DisplayDetails() {
        System.out.println("Name: " + Names + "\n" +
                "Class: " + Class + "\n" +
                "Roll: " + Roll + "\n" +
                "Maths: " + Maths + "\n" +
                "Nepali: " + Nepali + "\n"+
                "English: " + English + "\n");
    }

}


public class Main {

    public static void main(String[] args) {

        Map<String, List<Student>> StudentMap = new HashMap<>();
        Map<String,List<Peformance>> PeformanceMap = new HashMap<>();
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("What do you want to do" + "\n" +
                    "1.Add" + "\n" +
                    "2.Edit" + "\n" +
                    "3.view" + "\n" +
                    "0.exit" + "\n");
            int MenuInput = input.nextInt();
            if (MenuInput == 1) {
                System.out.println("How Many entry are you trying to do ?");
                int numberofentry = input.nextInt();
                int j = 0;
                for (int i = 0; i < numberofentry; i++) {
                    System.out.println("Input Name , School , DOB , Age , Class and marks obtained in English , Nepali , Maths respectively");

                    String Name = input.next();
                    String School = input.next();
                    String DOB = input.next();
                    String Age = input.next();
                    String Class = input.next();
                    String Roll = input.next();
                    int English = input.nextInt();
                    int Nepali = input.nextInt();
                    int Maths = input.nextInt();

                    if (StudentMap.get(Class) == null ) {
                        List<Student> students = new ArrayList<>();
                        List<Peformance> peformance = new ArrayList<>();


                            Student newstudent = new Student(Name,School,DOB,Age,Class,Roll);
                            Peformance newpeformance = new Peformance(Name,Class,Roll,Nepali,English,Maths);
                            students.add(newstudent);
                            peformance.add(newpeformance);

                        StudentMap.put(Class,students);
                        PeformanceMap.put(Class,peformance);
                    }else {
                        List<Student> exitingStudents = StudentMap.get(Class);
                        List<Peformance> exitingPeformance = PeformanceMap.get(Class);


                            Student newstudent = new Student(Name,School,DOB,Age,Class,Roll);
                            Peformance newpeformance = new Peformance(Name,Class,Roll,Nepali,English,Maths);
                            exitingStudents.add(newstudent);
                            exitingPeformance.add(newpeformance);

                        StudentMap.put(Class,exitingStudents);
                        PeformanceMap.put(Class,exitingPeformance);
                    }


                }
            }
            if (MenuInput == 2) {
                System.out.println("what grade do you want to edit ? ");
                String grade = input.next();
                System.out.println("what index you want to edit");
                int indexOfArray = input.nextInt();
                System.out.println("Input Name , School , DOB , Age , Class and marks obtained in English , Nepali , Maths respectively");

                String Name = input.next();
                String School = input.next();
                String DOB = input.next();
                String Age = input.next();
                String Class = input.next();
                String Roll = input.next();
                int English = input.nextInt();
                int Nepali = input.nextInt();
                int Maths = input.nextInt();
                StudentMap.get(grade).get(indexOfArray).setClass(Class);
                StudentMap.get(grade).get(indexOfArray).setAge(Age);
                StudentMap.get(grade).get(indexOfArray).setDOB(DOB);
                StudentMap.get(grade).get(indexOfArray).setName(Name);
                StudentMap.get(grade).get(indexOfArray).setSchool(School);
                StudentMap.get(grade).get(indexOfArray).setRoll(Roll);

                PeformanceMap.get(grade).get(indexOfArray).setRoll(Roll);
                PeformanceMap.get(grade).get(indexOfArray).setClass(Class);
                PeformanceMap.get(grade).get(indexOfArray).setName(Name);
                PeformanceMap.get(grade).get(indexOfArray).setEnglish(English);
                PeformanceMap.get(grade).get(indexOfArray).setNepali(Nepali);
                PeformanceMap.get(grade).get(indexOfArray).setMaths(Maths);





            }
            if (MenuInput == 3) {
                System.out.println("what grade do you want to view ? ");
                String grade = input.next();
                System.out.println("do you want to view peformance or details of students in "+ grade +" grade");
                String peformanceDetails = input.next();
                if(peformanceDetails.equals("peformance")){
                    for( Peformance P : PeformanceMap.get(grade))
                       P.DisplayDetails();
                }
                if(peformanceDetails.equals("details")){
                    for(int i = 0;i<(StudentMap.get(grade).size());i++) StudentMap.get(grade).get(0).DisplayDetails();
                   System.out.println(StudentMap.get(grade).size());
                }

            }
            if (MenuInput == 0) {
                break;
            }

        }



    }
}
