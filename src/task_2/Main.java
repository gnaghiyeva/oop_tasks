package task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student's information");
      Student s1 = new Student(sc.nextLine(),sc.nextLine(),sc.nextInt());
      s1.university="BDU";
      s1.examResult=98;

        //System.out.println("Student's value");
       // s1.display();
        s1.showExamResultWithAlphabet();
    }
}
