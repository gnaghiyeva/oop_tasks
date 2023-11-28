package task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Multidimentional arr = new Multidimentional(sc.nextInt(), sc.nextInt());

         arr.enterValuesFromConsole();
        System.out.print("1-ci diaqonal ");
        arr.findFirstDiagonalElements() ;
        System.out.println();
        System.out.print("2-ci diaqonal ");
        arr.findSecondDiagonalElements();

    }
}
