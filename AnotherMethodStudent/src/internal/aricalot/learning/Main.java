package internal.aricalot.learning;

import java.util.*;

public class Main {
    static Map<Integer, List<Students>>  studentMap = new HashMap<>();
    static Map<Integer,List<Peformance>>  peformanceMap = new HashMap<>();

    public static void addNewStudentsService() {
        Scanner input = new Scanner(System.in);

        System.out.print("\n Enter Students Name  :");
        String name = input.next();
        System.out.print("Enter Students Class  :");
        int grade = input.nextInt();
        System.out.print("Enter Students Roll no. :");
        int roll = input.nextInt();
        System.out.print("Marks Obtained in Maths :");
        float maths = input.nextFloat();
        System.out.print("Marks Obtained in Nepali :");
        float nepali = input.nextFloat();
        System.out.print("Marks Obtained in English  :");
        float english = input.nextFloat();
        if(studentMap.get(grade)==null){
            List<Students> studentDetails = new ArrayList<>();
            List<Peformance> studentPeformances = new ArrayList<>();
            Students newStudent = new Students(name,grade,roll);
            Peformance newStudentPeformance = new Peformance(name,grade,roll,maths,nepali,english);
            studentDetails.add(newStudent);
            studentPeformances.add(newStudentPeformance);
            studentMap.put(grade,studentDetails);
            peformanceMap.put(grade,studentPeformances);
        }
        else{
            List<Students> existingStudents = studentMap.get(grade);
            List<Peformance> existingstudentPeformances = peformanceMap.get(grade);
            Students newStudent = new Students(name,grade,roll);
            Peformance newStudentPeformance = new Peformance(name,grade,roll,maths,nepali,english);
            existingStudents.add(newStudent);
            existingstudentPeformances.add(newStudentPeformance);
            studentMap.put(grade,existingStudents);
            peformanceMap.put(grade,existingstudentPeformances);
        }

    }

    public static void main(String[] args) {
//        Students newStudent = new Students("sulav", 2, 12);
//        Peformance newStudentPeformance = new Peformance("sulav", 2, 12, 56, 32, 30);
//
//        System.out.println(newStudent.displayDetailsOfStudents());
//        System.out.println(newStudentPeformance.displayPeformanceOfStudents());

        Scanner input = new Scanner(System.in);
//        Map<Integer, List<Students>>  studentMap = new HashMap<>();
//        Map<Integer,List<Peformance>>  peformanceMap = new HashMap<>();

        while(true){
                System.out.println("\n"+"what operation do you want to peform \n"+
                        "1. Add Student \n"+
                        "2. Edit Student \n"+
                        "3. View Student \n"+
                        "4. Remove Student \n"+
                        "0. Exit \n");
                int menuNagivation = input.nextInt();
                if(menuNagivation == 1){
                    System.out.println("How many Students do you want to add ? \n");
                    int numberOfInputs= input.nextInt();
                    for (int i =0; i<numberOfInputs;i++){
                        addNewStudentsService();


                    }


                }
                else if(menuNagivation == 2){
                    System.out.println("what grade do you want to Edit \n");
                    int grade= input.nextInt();
                    System.out.println("what roll no student do you want to Edit ?\n");
                    int rollNo= input.nextInt();
                    for(int i = 0 ; i<studentMap.get(grade).size();i++){
                        if(studentMap.get(grade).get(i).getRoll() == rollNo){
                            System.out.print("\n Enter Students Name  :");
                            String name = input.next();
                            System.out.print("Enter Students Class  :");
                            int gradee = input.nextInt();
                            System.out.print("Enter Students Roll no. :");
                            int roll = input.nextInt();
                            System.out.print("Marks Obtained in Maths :");
                            float maths = input.nextFloat();
                            System.out.print("Marks Obtained in Nepali :");
                            float nepali = input.nextFloat();
                            System.out.print("Marks Obtained in English  :");
                            float english = input.nextFloat();


                            studentMap.get(grade).get(i).setName(name);
                            studentMap.get(grade).get(i).setGrade(gradee);
                            studentMap.get(grade).get(i).setRoll(roll);
                            peformanceMap.get(grade).get(i).setEnglish(english);
                            peformanceMap.get(grade).get(i).setMaths(maths);
                            peformanceMap.get(grade).get(i).setNepali(nepali);


                        }
                    }






                }
                else if(menuNagivation == 3){
                    System.out.println("what grade do you want to view \n");
                    int grade= input.nextInt();
                    for(int i = 0; i<studentMap.get(grade).size();i++){
                        System.out.println(studentMap.get(grade).get(i).displayDetailsOfStudents());
                        System.out.println("\n Marks Obtained in English : "+peformanceMap.get(grade).get(i).getEnglish());
                        System.out.println("Marks Obtained in Nepali : "+peformanceMap.get(grade).get(i).getNepali());
                        System.out.println("Marks Obtained in Maths : "+peformanceMap.get(grade).get(i).getMaths());
                        System.out.println("Percentage : "+ (((peformanceMap.get(grade).get(i).getMaths()+peformanceMap.get(grade).get(i).getNepali()+peformanceMap.get(grade).get(i).getEnglish())/300)*100)+"\n");

                    }
                }
                else if(menuNagivation == 4){
                    System.out.println("what grade do you want to view \n");
                    int grade= input.nextInt();
                    System.out.println("what roll no student do you want to remove ?\n");
                    int rollNo= input.nextInt();
                    for(int i = 0 ; i<studentMap.get(grade).size();i++){
                        if(studentMap.get(grade).get(i).getRoll() == rollNo){
                            studentMap.get(grade).remove(i);
                            peformanceMap.get(grade).remove(i);
                        }
                    }
                    for(int i = 0; i<studentMap.get(grade).size();i++){
                        System.out.println(studentMap.get(grade).get(i).displayDetailsOfStudents());
                        System.out.println("\n Marks Obtained in English : "+peformanceMap.get(grade).get(i).getEnglish());
                        System.out.println("Marks Obtained in Nepali : "+peformanceMap.get(grade).get(i).getNepali());
                        System.out.println("Marks Obtained in Maths : "+peformanceMap.get(grade).get(i).getMaths());
                        System.out.println("Percentage : "+ (((peformanceMap.get(grade).get(i).getMaths()+peformanceMap.get(grade).get(i).getNepali()+peformanceMap.get(grade).get(i).getEnglish())/300)*100)+"\n");

                    }


                }
                else if(menuNagivation == 0){break;}
                else System.out.println("Please enter valid number from the list below \n");

        }
    }}
