package task_4;

public class Student {
    String name;
    String surname;
    double gpa;
    static int objectCount=0;


    public Student(){
        objectCount++;
    }

    public Student(String myName){
        name = myName;
        objectCount++;
    }

    public Student(String myName, String mySurname){
        name = myName;
        surname=mySurname;
        objectCount++;
    }
    public Student(String myName, String mySurname, double myGpa){
        name=myName;
        surname=mySurname;
        gpa=myGpa;
        objectCount++;
    }
   public static void displayObjectCount(){
       System.out.println(objectCount);
    }
}
