package task_4;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Gulnar");
        Student s3 = new Student("Gulnar","Naghiyeva");
        Student s4 = new Student("Gulnar","Naghiyeva", 92.51);

        Student.displayObjectCount();

    }
}
