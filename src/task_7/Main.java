package task_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name:");
        String name = sc.nextLine();

        System.out.print("Enter surname:");
        String surname = sc.nextLine();

        System.out.print("Enter age:");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter university:");
        String university = sc.nextLine();

        System.out.print("Enter faculty:");
        String faculty = sc.nextLine();

        System.out.print("Enter group:");
        String group = sc.nextLine();

        System.out.print("Enter teacher:");
        String teacher = sc.nextLine();

        System.out.print("Enter GPA:");
        double gpa = sc.nextDouble();


        Student s1 = new Student(
                name,
                surname,
                age,
                university,
                faculty,
                group,
                teacher,
                gpa
        );

        s1.getObjectCount();

        Teacher t1 = new Teacher(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextLine(),sc.nextInt());


    }
}
