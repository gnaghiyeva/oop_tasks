package task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the information (name,surname,university,age)");
        Person p1 = new Person(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());

        System.out.println("Person's information");
        p1.display();
    }
}
