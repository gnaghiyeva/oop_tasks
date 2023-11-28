package task_7;

public class Student extends Person{
    String university;
    String faculty;
    String group;
    String teacher;
    double gpa;

    static int objectCount=0;

    public Student(String name,
                   String surname,
                   int age,
                   String university,
                   String faculty,
                   String group,
                   String teacher,
                   double gpa) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.university = university;
        this.faculty = faculty;
        this.group = group;
        this.teacher = teacher;
        this.gpa = gpa;
        objectCount++;
    }

    public void getObjectCount(){
        System.out.println(objectCount);
    }



}
