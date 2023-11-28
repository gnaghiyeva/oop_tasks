package task_3;

import java.util.Scanner;

public class Multidimentional {
    int rawSize;
    int columnSize;
    static int[][] arr;

    public Multidimentional(int rawSize, int columnSize) {
        this.rawSize = rawSize;
        this.columnSize = columnSize;
    }




    public int enterValuesFromConsole(){
       Scanner sc = new Scanner(System.in);
       arr = new int[rawSize][columnSize];
        System.out.println("Enter elements");
        for (int i = 0; i < rawSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                arr[i][j]=sc.nextInt();
            }

        }
        return 0;
    }

    public static int[] findFirstDiagonalElements(){
        int rows = arr.length;
        int cols = arr[0].length;

        int[] diagonalElements = new int[rows];
        for (int i = 0; i < rows; i++) {
            diagonalElements[i] = arr[i][i];
        }
        for (int i : diagonalElements) {
            System.out.print(i+" ");
        }
        return diagonalElements;

    }
//public static int[] findDiagonalElements111() {
//    int rows1 = arr.length;
//    int cols1 = arr[0].length;
//
//    int[] diagonalElements = new int[rows1];
//
//    for (int i = 0; i < rows1; i++) {
//        diagonalElements[i] = arr[i][i];
//    }
//    for (int i : diagonalElements) {
//        System.out.println(i);
//    }
//    return diagonalElements;
//    }

    public int[] findSecondDiagonalElements(){
        int rows = arr.length;
        int cols = arr[0].length;

        int[] diagonalElements = new int[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if((i+j)==(arr.length-1)){
                    diagonalElements[i] =  arr[i][j];
//                   System.out.print(arr[i][j]+", ");
                }

            }

        }

        for (int i : diagonalElements) {
            System.out.print(i+" ");
        }
        return diagonalElements;


    }

}
