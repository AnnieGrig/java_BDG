package methods;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input matrix number: ");
        int number = sc.nextInt();
        printMatrix(number);
    }


    public static void printMatrix(int num) {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                double xNumber = Math.round(Math.random());
                System.out.print((int) (xNumber) + " ");
            }
            System.out.println();
        }
    }
}
