package task_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: a,b,c");
        findMaxMin f = new findMaxMin(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println(f.multiplyMaxMin());
    }


}
